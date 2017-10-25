package metrifier
package benchmark

import freestyle._
import freestyle.implicits._
import org.openjdk.jmh.annotations._
import metrifier.rpc.client.RPCClient
import metrifier.shared.model._
import metrifier.benchmark.rpc.implicits._
import java.util.concurrent.TimeUnit

import monix.eval.Task

import scala.concurrent.duration.Duration
import scala.concurrent.Await

@State(Scope.Thread)
@BenchmarkMode(Array(Mode.Throughput))
@OutputTimeUnit(TimeUnit.SECONDS)
class RPCBenchmark {

  @Benchmark
  def listPersons: PersonList = {

    def program[M[_]](implicit APP: RPCClient[M]): FreeS[M, PersonList] = APP.listPersons

    Await.result(program[RPCClient.Op].interpret[Task].runAsync, Duration.Inf)
  }

  @Benchmark
  def getPerson: Person = {

    def program[M[_]](implicit APP: RPCClient[M]): FreeS[M, Person] = APP.getPerson("1")

    Await.result(program[RPCClient.Op].interpret[Task].runAsync, Duration.Inf)
  }

  @Benchmark
  def getPersonLinks: PersonLinkList = {

    def program[M[_]](implicit APP: RPCClient[M]): FreeS[M, PersonLinkList] = APP.getPersonLinks("1")

    Await.result(program[RPCClient.Op].interpret[Task].runAsync, Duration.Inf)
  }

  @Benchmark
  def createPerson: Person = {

    def program[M[_]](implicit APP: RPCClient[M]): FreeS[M, Person] =
      APP.createPerson(
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

    Await.result(program[RPCClient.Op].interpret[Task].runAsync, Duration.Inf)
  }

  @Benchmark
  def programComposition: PersonAggregation = {

    def program[M[_]](implicit APP: RPCClient[M]): FreeS[M, PersonAggregation] = {
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

    Await.result(program[RPCClient.Op].interpret[Task].runAsync, Duration.Inf)
  }

}
