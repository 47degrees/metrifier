package metrifier
package demo

import metrifier.shared.model._
import metrifier.rpc.client.implicits._
import metrifier.rpc.protocols.PersonService
import monix.eval.Task

import scala.concurrent.Await
import scala.concurrent.duration._

object RPCDemoApp {

  def clientProgram(implicit client: PersonService.Client[Task]): Task[PersonAggregation] = {
    for {
      personList <- client.listPersons("foo")
      p1         <- client.getPerson("1")
      p2         <- client.getPerson("2")
      p3         <- client.getPerson("3")
      p4         <- client.getPerson("4")
      p1Links    <- client.getPersonLinks(p1.id)
      p3Links    <- client.getPersonLinks(p3.id)
      pNew <- client.createPerson(Person(
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
        ))
    } yield (p1, p2, p3, p4, p1Links, p3Links, personList.add(pNew))
  }

  def main(args: Array[String]): Unit = {

    val result: PersonAggregation =
      Await.result(clientProgram.runAsync, Duration.Inf)

    println(s"Result = $result")

  }

}
