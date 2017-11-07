package metrifier
package benchmark

import java.util.concurrent.TimeUnit

import metrifier.http.client.HttpClient
import metrifier.http.HttpConf
import metrifier.shared.model._
import org.http4s.client.blaze.PooledHttp1Client
import org.openjdk.jmh.annotations._

import scalaz.concurrent.Task

@State(Scope.Thread)
@BenchmarkMode(Array(Mode.Throughput))
@OutputTimeUnit(TimeUnit.SECONDS)
class HttpBenchmark {

  val client: HttpClient = new HttpClient(PooledHttp1Client(), HttpConf.host, HttpConf.port)

  @Benchmark
  def listPersons: PersonList = client.listPersons.unsafePerformSync

  @Benchmark
  def getPerson: Person = client.getPerson(PersonId("1")).unsafePerformSync

  @Benchmark
  def getPersonLinks: PersonLinkList = client.getPersonLinks(PersonId("1")).unsafePerformSync

  @Benchmark
  def createPerson: Person = client.createPerson(
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
      ).unsafePerformSync

  @Benchmark
  def programComposition: PersonAggregation = {

    val aggregation: Task[PersonAggregation] = for {
      personList <- client.listPersons
      p1         <- client.getPerson(PersonId("1"))
      p2         <- client.getPerson(PersonId("2"))
      p3         <- client.getPerson(PersonId("3"))
      p4         <- client.getPerson(PersonId("4"))
      p1Links    <- client.getPersonLinks(PersonId(p1.id))
      p3Links    <- client.getPersonLinks(PersonId(p3.id))
      pNew <- client.createPerson(
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

    aggregation.unsafePerformSync
  }

}
