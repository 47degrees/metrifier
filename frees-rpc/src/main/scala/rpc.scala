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
