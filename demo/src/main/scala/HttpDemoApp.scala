package metrifier
package demo

import cats.effect.{ExitCode, IO, IOApp}
import cats.syntax.functor._
import metrifier.demo.Utils._
import metrifier.http.HttpConf
import metrifier.http.client._
import metrifier.shared.model._
import org.http4s.client.asynchttpclient.AsyncHttpClient

object HttpDemoApp extends IOApp {

  def run(args: List[String]): IO[ExitCode] = {

    AsyncHttpClient.resource[IO]().use { httpClient =>
      aggregation(new HttpClient(httpClient, HttpConf.host, HttpConf.port)).flatMap { result =>
        IO(println(s"Result = $result"))
      }.as(ExitCode.Success)
    }
  }

  def aggregation(client: HttpClient[IO]): IO[PersonAggregation] = for {
    personList <- client.listPersons
    p1         <- client.getPerson(PersonId("1"))
    p2         <- client.getPerson(PersonId("2"))
    p3         <- client.getPerson(PersonId("3"))
    p4         <- client.getPerson(PersonId("4"))
    p1Links    <- client.getPersonLinks(PersonId(p1.id))
    p3Links    <- client.getPersonLinks(PersonId(p3.id))
    pNew <- client.createPerson(
      id = person.id,
      nameTitle = person.name.title,
      nameFirst = person.name.first,
      nameLast = person.name.last,
      gender = person.gender,
      locationStreet = person.location.street,
      locationCity = person.location.city,
      locationState = person.location.state,
      locationPostCode = person.location.postCode,
      email = person.email,
      pictureLarge = person.picture map (_.large),
      pictureMedium = person.picture map (_.medium),
      pictureThumbnail = person.picture map (_.thumbnail)
    )
  } yield (p1, p2, p3, p4, p1Links, p3Links, personList.add(pNew))

}
