package metrifier
package rpc
package server

import cats.implicits._
import freestyle.rpc.server.GrpcServerApp
import freestyle.rpc.server.implicits._
import metrifier.rpc.server.proto.implicits._
import journal.Logger

import scala.concurrent.Await
import scala.concurrent.duration.Duration

object RPCProtoServer {

  val logger: Logger = Logger[this.type]

  def main(args: Array[String]): Unit = {

    logger.info(s"Server is starting ...")

    Await.result(server[GrpcServerApp.Op].bootstrapFuture, Duration.Inf)
  }

}
