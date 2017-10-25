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

import cats.{Comonad, ~>}
import monix.eval.Task

import scala.concurrent.{Await, ExecutionContext, Future}
import scala.concurrent.duration._

trait PersonServiceEC {

  implicit val ec: ExecutionContext = ExecutionContext.Implicits.global
  implicit val S: monix.execution.Scheduler =
    monix.execution.Scheduler.Implicits.global

}

trait FutureInstances extends freestyle.rpc.client.FutureInstances {

  protected val atMostDuration: FiniteDuration = 10.seconds

  implicit def futureComonad(implicit ec: ExecutionContext): Comonad[Future] =
    new Comonad[Future] {
      def extract[A](x: Future[A]): A = {
        Await.result(x, atMostDuration)
      }

      override def coflatMap[A, B](fa: Future[A])(f: (Future[A]) => B): Future[B] = Future(f(fa))

      override def map[A, B](fa: Future[A])(f: (A) => B): Future[B] =
        fa.map(f)
    }

  implicit val future2Task: Future ~> Task =
    new (Future ~> Task) {
      override def apply[A](fa: Future[A]): Task[A] = {
        Task.deferFuture(fa)
      }
    }
}

trait TaskInstances {

  implicit val task2Task: Task ~> Task = new (Task ~> Task) {
    override def apply[A](fa: Task[A]): Task[A] = fa
  }

}

trait PersonServiceRuntime extends PersonServiceEC with FutureInstances with TaskInstances
