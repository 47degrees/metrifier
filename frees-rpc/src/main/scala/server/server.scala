/*
 * Copyright 2017 47 Degrees, LLC. <http://www.47deg.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package metrifier
package rpc
package server

import cats.~>
import cats.implicits._
import freestyle.implicits._
import freestyle.config.implicits._
import freestyle.async.implicits._
import freestyle.rpc.server._
import protocols.PersonService

import scala.concurrent.Future
import scala.util.{Failure, Success, Try}

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
