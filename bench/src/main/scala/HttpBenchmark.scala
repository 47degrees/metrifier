package metrifier
package benchmark

import java.util.concurrent.TimeUnit

import cats.effect.IO
import metrifier.benchmark.Utils._
import metrifier.http.HttpConf
import metrifier.http.client.HttpClient
import metrifier.shared.model._
import org.http4s.client.blaze.Http1Client
import org.openjdk.jmh.annotations._

@State(Scope.Thread)
@BenchmarkMode(Array(Mode.Throughput))
@OutputTimeUnit(TimeUnit.SECONDS)
class HttpBenchmark {

  def client = new HttpClient(Http1Client[IO]().unsafeRunSync(), HttpConf.host, HttpConf.port)

  @Benchmark
  def listPersons: PersonList = client.listPersons.unsafeRunSync()

  @Benchmark
  def getPerson: Person = client.getPerson(PersonId("1")).unsafeRunSync()

  @Benchmark
  def getPersonLinks: PersonLinkList = client.getPersonLinks(PersonId("1")).unsafeRunSync()

  @Benchmark
  def createPerson: Person = mkPerson.unsafeRunSync()

  @Benchmark
  def programComposition: PersonAggregation = {

    val aggregation: IO[PersonAggregation] = for {
      personList <- client.listPersons
      p1         <- client.getPerson(PersonId("1"))
      p2         <- client.getPerson(PersonId("2"))
      p3         <- client.getPerson(PersonId("3"))
      p4         <- client.getPerson(PersonId("4"))
      p1Links    <- client.getPersonLinks(PersonId(p1.id))
      p3Links    <- client.getPersonLinks(PersonId(p3.id))
      pNew       <- mkPerson
    } yield (p1, p2, p3, p4, p1Links, p3Links, personList.add(pNew))

    aggregation.unsafeRunSync()
  }

  private[this] def mkPerson =
    client.createPerson(
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
}
