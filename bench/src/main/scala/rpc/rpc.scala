package metrifier
package benchmark

import cats.implicits._
import freestyle.implicits._
import freestyle.asyncCatsEffect.implicits._
import freestyle.rpc.client._
import freestyle.rpc.client.implicits._
import monix.eval.Task
import io.grpc.ManagedChannel
import metrifier.rpc._
import metrifier.rpc.client._
import metrifier.rpc.protocols._

import scala.concurrent.Future

package object rpc {

  trait ClientConf {

    val channelFor: ManagedChannelFor = ManagedChannelForAddress("localhost", 50051)

    val channelConfigList: List[ManagedChannelConfig] = List(UsePlaintext(true))

    val managedChannelInterpreter =
      new ManagedChannelInterpreter[Future](channelFor, channelConfigList)

    val channel: ManagedChannel = managedChannelInterpreter.build(channelFor, channelConfigList)

  }

  trait Implicits extends PersonServiceRuntime with ClientConf {

    implicit val personServiceClient: PersonService.Client[Task] =
      PersonService.client[Task](channel)

    implicit val rpcClientHandler: RPCClientHandler[Task] =
      new RPCClientHandler[Task]
  }

  object implicits extends Implicits

}
