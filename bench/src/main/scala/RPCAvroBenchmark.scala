package metrifier
package benchmark

import cats.effect.IO
import freestyle.rpc.protocol.Empty
import java.util.concurrent.TimeUnit
import metrifier.benchmark.Utils._
import metrifier.rpc.client.implicits._
import metrifier.rpc.protocols._
import metrifier.shared.model._
import org.openjdk.jmh.annotations._

@State(Scope.Thread)
@BenchmarkMode(Array(Mode.Throughput))
@OutputTimeUnit(TimeUnit.SECONDS)
class RPCAvroBenchmark {

  val client: PersonServiceAvro.Client[IO] = implicitly[PersonServiceAvro.Client[IO]]

  @Benchmark
  def listPersons: PersonList = client.listPersons(Empty).unsafeRunTimed(defaultTimeOut).get

  @Benchmark
  def getPerson: Person = client.getPerson(PersonId("1")).unsafeRunTimed(defaultTimeOut).get

  @Benchmark
  def getPersonLinks: PersonLinkList =
    client.getPersonLinks(PersonId("1")).unsafeRunTimed(defaultTimeOut).get

  @Benchmark
  def createPerson: Person =
    client.createPerson(person).unsafeRunTimed(defaultTimeOut).get

  @Benchmark
  def programComposition: PersonAggregation = {

    def clientProgram: IO[PersonAggregation] = {
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

    clientProgram.unsafeRunTimed(defaultTimeOut).get
  }

}
