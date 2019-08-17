package metrifier
package rpc
package server

import cats.effect.{ExitCode, IO, IOApp}
import higherkindness.mu.rpc.config.server.BuildServerFromConfig
import higherkindness.mu.rpc.server.GrpcServer
import org.log4s.Logger
import metrifier.rpc.server.proto.implicits._

object RPCProtoServer extends IOApp {

  val logger: Logger = org.log4s.getLogger

  def run(args: List[String]): IO[ExitCode] = for {
    _ <- IO(logger.info(s"Server is starting ..."))
    config <- grpcConfigsProto
    server <- BuildServerFromConfig[IO]("rpc.port", List(config))
    _ <- GrpcServer.server[IO](server)
  } yield ExitCode.Success

}
