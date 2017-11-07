package metrifier
package rpc

import cats.~>
import cats.implicits._
import freestyle.implicits._
import freestyle.config.implicits._
import freestyle.rpc.protocol.Empty
import freestyle.rpc.server._
import metrifier.shared.model.{Person, PersonId, PersonLinkList, PersonList}
import metrifier.shared.services
import protocols._

import scala.concurrent.Future
import scala.util.{Failure, Success, Try}

package object server {

  trait ServerConf {

    def getConf(grpcConfigs: List[GrpcConfig]): ServerW =
      BuildServerFromConfig[ServerConfig.Op]("rpc.port", grpcConfigs)
        .interpret[Try] match {
        case Success(c) => c
        case Failure(e) =>
          e.printStackTrace()
          throw new RuntimeException("Unable to load the server configuration", e)
      }

  }

  trait HandlerImpl {

    def listPersons(b: Empty): Future[PersonList] =
      Future.successful(services.listPersons)

    def getPerson(id: PersonId): Future[Person] =
      Future.successful(services.getPerson(id))

    def getPersonLinks(id: PersonId): Future[PersonLinkList] =
      Future.successful(services.getPersonLinks(id))

    def createPerson(person: Person): Future[Person] =
      Future.successful(services.createPerson(person))
  }

  class RPCProtoHandler extends PersonServicePB.Handler[Future] with HandlerImpl

  class RPCAvroHandler extends PersonServiceAvro.Handler[Future] with HandlerImpl {

    override protected[this] def listPersons(empty: EmptyAvro): Future[PersonList] =
      Future.successful(services.listPersons)

  }

  trait CommonImplicits extends PersonServiceRuntime with ServerConf

  object proto {

    trait ProtoImplicits extends CommonImplicits {

      import freestyle.rpc.server.handlers._
      import freestyle.rpc.server.implicits._

      implicit val personServicePBHandler: PersonServicePB.Handler[Future] = new RPCProtoHandler

      implicit val grpcServerHandler: GrpcServer.Op ~> Future =
        new GrpcServerHandler[Future] andThen
          new GrpcKInterpreter[Future](
            getConf(
              List(
                AddService(PersonServicePB.bindService[PersonServicePB.Op, Future])
              )
            ).server
          )
    }

    object implicits extends ProtoImplicits
  }

  object avro {

    trait AvroImplicits extends CommonImplicits {

      import freestyle.rpc.server.handlers._
      import freestyle.rpc.server.implicits._

      implicit val personServiceAvroHandler: PersonServiceAvro.Handler[Future] = new RPCAvroHandler

      implicit val grpcServerHandler: GrpcServer.Op ~> Future =
        new GrpcServerHandler[Future] andThen
          new GrpcKInterpreter[Future](
            getConf(
              List(
                AddService(PersonServiceAvro.bindService[PersonServiceAvro.Op, Future])
              )
            ).server
          )

    }

    object implicits extends AvroImplicits
  }

}
