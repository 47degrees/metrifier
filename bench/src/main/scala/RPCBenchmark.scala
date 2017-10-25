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

/**
  * Run the benchmark from within SBT:
  *
  *     jmh:run -i 10 -wi 10 -f 2 -t 1 metrifier.benchmark.RPCBenchmark
  *
  * Which means "10 iterations", "10 warm-up iterations", "2 fork", "1 thread".
  */
@State(Scope.Thread)
@BenchmarkMode(Array(Mode.Throughput))
@OutputTimeUnit(TimeUnit.SECONDS)
class RPCBenchmark {

  @Param(Array("100"))
  var size: Int = _

  @Benchmark
  def listPersons(): PersonList = {

    def program[M[_]](implicit APP: RPCClient[M]): FreeS[M, PersonList] =
      APP.listPersons

    Await.result(program[RPCClient.Op].interpret[Task].runAsync, Duration.Inf)
  }
}
