package metrifier
package benchmark

import org.openjdk.jmh.annotations._
import metrifier.shared.model._
import metrifier.rpc.client.implicits._
import java.util.concurrent.TimeUnit

import freestyle.rpc.protocol.Empty
import metrifier.rpc.protocols.PersonServicePB
import monix.eval.Task

import scala.concurrent.duration.Duration
import scala.concurrent.Await

@State(Scope.Thread)
@BenchmarkMode(Array(Mode.Throughput))
@OutputTimeUnit(TimeUnit.SECONDS)
class RPCBenchmark {

  val client: PersonServicePB.Client[Task] = implicitly[PersonServicePB.Client[Task]]
  val p5: Person = Person(
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

  @Benchmark
  def listPersons: PersonList = Await.result(client.listPersons(Empty()).runAsync, Duration.Inf)

  @Benchmark
  def getPerson: Person = Await.result(client.getPerson(PersonId("1")).runAsync, Duration.Inf)

  @Benchmark
  def getPersonLinks: PersonLinkList =
    Await.result(client.getPersonLinks(PersonId("1")).runAsync, Duration.Inf)

  @Benchmark
  def createPerson: Person =
    Await.result(
      client
        .createPerson(p5)
        .runAsync,
      Duration.Inf
    )

  @Benchmark
  def programComposition: PersonAggregation = {

    def clientProgram: Task[PersonAggregation] = {
      for {
        personList <- client.listPersons(Empty())
        p1         <- client.getPerson(PersonId("1"))
        p2         <- client.getPerson(PersonId("2"))
        p3         <- client.getPerson(PersonId("3"))
        p4         <- client.getPerson(PersonId("4"))
        p1Links    <- client.getPersonLinks(PersonId(p1.id))
        p3Links    <- client.getPersonLinks(PersonId(p3.id))
        pNew <- client.createPerson(p5)
      } yield (p1, p2, p3, p4, p1Links, p3Links, personList.add(pNew))
    }

    Await.result(clientProgram.runAsync, Duration.Inf)
  }

}
