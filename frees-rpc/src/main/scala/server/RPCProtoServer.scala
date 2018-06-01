package metrifier
package rpc
package server

import cats.effect.IO
import freestyle.rpc.server.implicits._
import metrifier.rpc.server.proto.implicits._
import org.log4s.Logger

object RPCProtoServer {

  val logger: Logger = org.log4s.getLogger

  def main(args: Array[String]): Unit = {

    logger.info(s"Server is starting ...")

    server[IO].unsafeRunSync()
  }

}
