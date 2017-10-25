package metrifier
package demo
package rpc

import freestyle._
import metrifier.shared.model._
import metrifier.rpc.client.RPCClient
import metrifier.demo.rpc.implicits._
import monix.eval.Task

import scala.concurrent.Await
import scala.concurrent.duration._

object RPCDemoApp {

  def clientProgram[M[_]](implicit APP: RPCClient[M]): FreeS[M, PersonAggregation] = {
    for {
      personList <- APP.listPersons
      p1         <- APP.getPerson("1")
      p2         <- APP.getPerson("2")
      p3         <- APP.getPerson("3")
      p4         <- APP.getPerson("4")
      p1Links    <- APP.getPersonLinks(p1.id)
      p3Links    <- APP.getPersonLinks(p3.id)
      pNew <- APP.createPerson(
        id = "5",
        nameTitle = "ms",
        nameFirst = "valentine",
        nameLast = "lacroix",
        gender = "female",
        locationStreet = "1494 avenue du fort-caire",
        locationCity = "orléans",
        locationState = "aveyron",
        locationPostCode = 91831,
        email = "valentine.lacroix@example.com",
        pictureLarge = None,
        pictureMedium = None,
        pictureThumbnail = None
      )
    } yield (p1, p2, p3, p4, p1Links, p3Links, personList.add(pNew))
  }

  def main(args: Array[String]): Unit = {

    val result: PersonAggregation =
      Await.result(clientProgram[RPCClient.Op].interpret[Task].runAsync, Duration.Inf)

    println(s"Result = $result")

  }

}
