package metrifier
package rpc

import cats.~>
import cats.implicits._
import freestyle.implicits._
import freestyle.config.implicits._
import freestyle.rpc.server._
import metrifier.shared.model.{Person, PersonLinkList, PersonList}
import metrifier.shared.services
import protocols.PersonService

import scala.concurrent.Future
import scala.util.{Failure, Success, Try}

package object server {

  trait ServerConf {

    def getConf(grpcConfigs: List[GrpcConfig]): ServerW =
      BuildServerFromConfig[ServerConfig.Op]("rpc.server.port", grpcConfigs)
        .interpret[Try] match {
        case Success(c) => c
        case Failure(e) =>
          e.printStackTrace()
          throw new RuntimeException("Unable to load the server configuration", e)
      }

  }

  trait Implicits extends PersonServiceRuntime with ServerConf {

    import freestyle.rpc.server.handlers._
    import freestyle.rpc.server.implicits._

    implicit val personServiceHandler: PersonService.Handler[Future] =
      new PersonService.Handler[Future] {

        override def listPersons(b: String): Future[PersonList] =
          Future.successful(services.listPersons)

        override def getPerson(id: String): Future[Person] =
          Future.successful(services.getPerson(id))

        override def getPersonLinks(id: String): Future[PersonLinkList] =
          Future.successful(services.getPersonLinks(id))

        override def createPerson(person: Person): Future[Person] =
          Future.successful(services.createPerson(person))

      }

    val grpcConfigs: List[GrpcConfig] = List(
      AddService(PersonService.bindService[PersonService.Op, Future])
    )

    implicit val grpcServerHandler: GrpcServer.Op ~> Future =
      new GrpcServerHandler[Future] andThen
        new GrpcKInterpreter[Future](getConf(grpcConfigs).server)
  }

  object implicits extends Implicits

}
