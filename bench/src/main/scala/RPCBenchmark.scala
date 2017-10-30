package metrifier
package benchmark

import org.openjdk.jmh.annotations._
import metrifier.shared.model._
import metrifier.benchmark.rpc.implicits._
import java.util.concurrent.TimeUnit

import metrifier.rpc.protocols.PersonService
import monix.eval.Task

import scala.concurrent.duration.Duration
import scala.concurrent.Await

@State(Scope.Thread)
@BenchmarkMode(Array(Mode.Throughput))
@OutputTimeUnit(TimeUnit.SECONDS)
class RPCBenchmark {

  val client: PersonService.Client[Task] = implicitly[PersonService.Client[Task]]

  @Benchmark
  def listPersons: PersonList = Await.result(client.listPersons("foo").runAsync, Duration.Inf)

  @Benchmark
  def getPerson: Person = Await.result(client.getPerson("1").runAsync, Duration.Inf)

  @Benchmark
  def getPersonLinks: PersonLinkList =
    Await.result(client.getPersonLinks("1").runAsync, Duration.Inf)

  @Benchmark
  def createPerson: Person =
    Await.result(
      client
        .createPerson(
          Person(
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
        .runAsync,
      Duration.Inf
    )

  @Benchmark
  def programComposition: PersonAggregation = {

    def clientProgram: Task[PersonAggregation] = {
      for {
        personList <- client.listPersons("foo")
        p1         <- client.getPerson("1")
        p2         <- client.getPerson("2")
        p3         <- client.getPerson("3")
        p4         <- client.getPerson("4")
        p1Links    <- client.getPersonLinks(p1.id)
        p3Links    <- client.getPersonLinks(p3.id)
        pNew <- client.createPerson(
          Person(
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

    Await.result(clientProgram.runAsync, Duration.Inf)
  }

}
