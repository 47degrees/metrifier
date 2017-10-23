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
package runtime


import cats.{Comonad, ~>}
import cats.implicits._
import freestyle.implicits._
import freestyle.config.implicits._
import freestyle.async.implicits._
import freestyle.rpc.server._
import journal.Logger
import monix.eval.Task
import metrifier.handlers.PersonServiceHandler
import metrifier.protocols.PersonService

import scala.concurrent.{Await, ExecutionContext, Future}
import scala.concurrent.duration._
import scala.util.{Failure, Success, Try}

trait PersonServiceExecutionContext {

  val logger: Logger = Logger[this.type]

  implicit val ec: ExecutionContext = ExecutionContext.Implicits.global
  implicit val S: monix.execution.Scheduler =
    monix.execution.Scheduler.Implicits.global

}

trait FutureInstances extends freestyle.rpc.client.FutureInstances {

  val logger: Logger = Logger[this.type]

  protected val atMostDuration: FiniteDuration = 10.seconds

  implicit def futureComonad(implicit ec: ExecutionContext): Comonad[Future] =
    new Comonad[Future] {
      def extract[A](x: Future[A]): A = {
        logger.info(s"${Thread.currentThread().getName} Waiting $atMostDuration for $x...")
        Await.result(x, atMostDuration)
      }

      override def coflatMap[A, B](fa: Future[A])(f: (Future[A]) => B): Future[B] = Future(f(fa))

      override def map[A, B](fa: Future[A])(f: (A) => B): Future[B] =
        fa.map(f)
    }

  implicit val future2Task: Future ~> Task =
    new (Future ~> Task) {
      override def apply[A](fa: Future[A]): Task[A] = {
        logger.info(s"${Thread.currentThread().getName} Deferring Future to Task...")
        Task.deferFuture(fa)
      }
    }
}

trait TaskInstances {

  implicit val task2Task: Task ~> Task = new (Task ~> Task) {
    override def apply[A](fa: Task[A]): Task[A] = fa
  }

}

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


trait PersonServiceRuntime extends PersonServiceExecutionContext with FutureInstances with TaskInstances

object server {

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
