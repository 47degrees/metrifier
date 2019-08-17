package metrifier
package rpc
package server

import cats.effect.{ExitCode, IO, IOApp}
import higherkindness.mu.rpc.config.server.BuildServerFromConfig
import higherkindness.mu.rpc.server.GrpcServer
import metrifier.rpc.server.avro.implicits._
import org.log4s.Logger

object RPCAvroServer extends IOApp {

  val logger: Logger = org.log4s.getLogger

  def run(args: List[String]): IO[ExitCode] = for {
    _ <- IO(logger.info(s"Server is starting ..."))
    config <- grpcConfigsAvro
    server <- BuildServerFromConfig[IO]("rpc.port", List(config))
  _ <- GrpcServer.server[IO](server)
  } yield ExitCode.Success

}
