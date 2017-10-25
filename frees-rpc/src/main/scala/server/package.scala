package metrifier
package rpc

import cats.~>
import cats.implicits._
import freestyle.implicits._
import freestyle.config.implicits._
import freestyle.rpc.server._
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
      new PersonServiceHandler[Future]

    val grpcConfigs: List[GrpcConfig] = List(
      AddService(PersonService.bindService[PersonService.Op, Future])
    )

    implicit val grpcServerHandler: GrpcServer.Op ~> Future =
      new GrpcServerHandler[Future] andThen
        new GrpcKInterpreter[Future](getConf(grpcConfigs).server)
  }

  object implicits extends Implicits

}
