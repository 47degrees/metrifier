package metrifier
package benchmark

import java.util.concurrent.TimeUnit

import metrifier.rpc.client.implicits._
import metrifier.rpc.protocols.{EmptyAvro, PersonServiceAvro}
import metrifier.shared.model._
import Utils._
import monix.eval.Task
import org.openjdk.jmh.annotations._

import scala.concurrent.Await
import scala.concurrent.duration.Duration

@State(Scope.Thread)
@BenchmarkMode(Array(Mode.Throughput))
@OutputTimeUnit(TimeUnit.SECONDS)
class RPCAvroBenchmark {

  val client: PersonServiceAvro.Client[Task] = implicitly[PersonServiceAvro.Client[Task]]

  @Benchmark
  def listPersons: PersonList = Await.result(client.listPersons(EmptyAvro()).runAsync, Duration.Inf)

  @Benchmark
  def getPerson: Person = Await.result(client.getPerson(PersonId("1")).runAsync, Duration.Inf)

  @Benchmark
  def getPersonLinks: PersonLinkList =
    Await.result(client.getPersonLinks(PersonId("1")).runAsync, Duration.Inf)

  @Benchmark
  def createPerson: Person =
    Await.result(
      client
        .createPerson(person)
        .runAsync,
      Duration.Inf
    )

  @Benchmark
  def programComposition: PersonAggregation = {

    def clientProgram: Task[PersonAggregation] = {
      for {
        personList <- client.listPersons(EmptyAvro())
        p1         <- client.getPerson(PersonId("1"))
        p2         <- client.getPerson(PersonId("2"))
        p3         <- client.getPerson(PersonId("3"))
        p4         <- client.getPerson(PersonId("4"))
        p1Links    <- client.getPersonLinks(PersonId(p1.id))
        p3Links    <- client.getPersonLinks(PersonId(p3.id))
        pNew <- client.createPerson(person)
      } yield (p1, p2, p3, p4, p1Links, p3Links, personList.add(pNew))
    }

    Await.result(clientProgram.runAsync, Duration.Inf)
  }

}
