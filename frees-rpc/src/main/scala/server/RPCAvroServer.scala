package metrifier
package rpc
package server

import cats.effect.IO
import freestyle.rpc.server.GrpcServer
import metrifier.rpc.server.avro.implicits._
import metrifier.rpc.server.proto.implicits.getConf
import org.log4s.Logger

object RPCAvroServer {

  val logger: Logger = org.log4s.getLogger

  def main(args: Array[String]): Unit = {

    logger.info(s"Server is starting ...")

    val avroServer =
      GrpcServer.default[IO](getConf.port, grpcConfigsAvro).flatMap(GrpcServer.server[IO])

    avroServer.unsafeRunSync()
  }

}
