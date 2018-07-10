package metrifier
package rpc
package server

import cats.effect.IO
import freestyle.rpc.server.GrpcServer
import org.log4s.Logger

object RPCProtoServer {

  import proto.implicits._

  val logger: Logger = org.log4s.getLogger

  def main(args: Array[String]): Unit = {

    logger.info(s"Server is starting ...")

    val pbServer = GrpcServer.default[IO](getConf.port, grpcConfigsProto).flatMap(GrpcServer.server[IO])

    pbServer.unsafeRunSync()
  }

}
