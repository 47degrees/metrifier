package metrifier
package benchmark

import metrifier.shared.model._

import scala.concurrent.duration._
import scala.concurrent.{Await, Future}

object Utils {

  val defaultTimeOut: FiniteDuration = 30.seconds

  val person: Person = Person(
    id = "5",
    name = PersonName(title = "ms", first = "valentine", last = "lacroix"),
    gender = "female",
    location = Location(
      street = "1494 avenue du fort-caire",
      city = "orléans",
      state = "aveyron",
      postCode = 91831),
    email = "valentine.lacroix@example.com",
    picture = None
  )

  implicit class FutureOps[A](f: Future[A]) {

    def runF: A = Await.result(f, defaultTimeOut)

  }
}
