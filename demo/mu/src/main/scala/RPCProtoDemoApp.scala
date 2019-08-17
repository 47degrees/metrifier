package metrifier
package demo

import cats.effect.{ExitCode, IO, IOApp}
import cats.syntax.functor._
import higherkindness.mu.rpc.protocol.Empty
import metrifier.demo.Utils._
import metrifier.rpc.client.implicits._
import metrifier.rpc.protocols.PersonServicePB
import metrifier.shared.model._

object RPCProtoDemoApp extends IOApp {

  def clientProgram(client: PersonServicePB[IO]): IO[PersonAggregation] = {
    for {
      personList <- client.listPersons(Empty)
      p1         <- client.getPerson(PersonId("1"))
      p2         <- client.getPerson(PersonId("2"))
      p3         <- client.getPerson(PersonId("3"))
      p4         <- client.getPerson(PersonId("4"))
      p1Links    <- client.getPersonLinks(PersonId(p1.id))
      p3Links    <- client.getPersonLinks(PersonId(p3.id))
      pNew       <- client.createPerson(person)
    } yield (p1, p2, p3, p4, p1Links, p3Links, personList.add(pNew))
  }

  def run(args: List[String]): IO[ExitCode] = personServicePBClient.use { client =>
    clientProgram(client).flatMap(result => IO(println(s"Result = $result")))
  }.as(ExitCode.Success)

}
