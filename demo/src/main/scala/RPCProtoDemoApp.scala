package metrifier
package demo

import freestyle.rpc.protocol.Empty
import metrifier.shared.model._
import metrifier.rpc.client.implicits._
import metrifier.rpc.protocols.PersonServicePB
import Utils._
import monix.eval.Task

import scala.concurrent.Await
import scala.concurrent.duration._

object RPCProtoDemoApp {

  def clientProgram(implicit client: PersonServicePB.Client[Task]): Task[PersonAggregation] = {
    for {
      personList <- client.listPersons(Empty())
      p1         <- client.getPerson(PersonId("1"))
      p2         <- client.getPerson(PersonId("2"))
      p3         <- client.getPerson(PersonId("3"))
      p4         <- client.getPerson(PersonId("4"))
      p1Links    <- client.getPersonLinks(PersonId(p1.id))
      p3Links    <- client.getPersonLinks(PersonId(p3.id))
      pNew <- client.createPerson(person)
    } yield (p1, p2, p3, p4, p1Links, p3Links, personList.add(pNew))
  }

  def main(args: Array[String]): Unit = {

    val result: PersonAggregation =
      Await.result(clientProgram.runAsync, Duration.Inf)

    println(s"Result = $result")

  }

}
