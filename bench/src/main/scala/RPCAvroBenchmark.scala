package metrifier
package benchmark

import java.util.concurrent.TimeUnit

import metrifier.rpc.client.implicits._
import metrifier.rpc.protocols.{EmptyAvro, PersonServiceAvro}
import metrifier.shared.model._
import Utils._
import monix.eval.Task
import org.openjdk.jmh.annotations._

@State(Scope.Thread)
@BenchmarkMode(Array(Mode.Throughput))
@OutputTimeUnit(TimeUnit.SECONDS)
class RPCAvroBenchmark {

  val client: PersonServiceAvro.Client[Task] = implicitly[PersonServiceAvro.Client[Task]]

  @Benchmark
  def listPersons: PersonList = client.listPersons(EmptyAvro()).runAsync.runF

  @Benchmark
  def getPerson: Person = client.getPerson(PersonId("1")).runAsync.runF

  @Benchmark
  def getPersonLinks: PersonLinkList =
    client.getPersonLinks(PersonId("1")).runAsync.runF

  @Benchmark
  def createPerson: Person =
    client
      .createPerson(person)
      .runAsync
      .runF

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
        pNew       <- client.createPerson(person)
      } yield (p1, p2, p3, p4, p1Links, p3Links, personList.add(pNew))
    }

    clientProgram.runAsync.runF
  }

}
