package metrifier
package rpc

import cats.implicits._
import freestyle.config.implicits._
import freestyle.asyncCatsEffect.implicits._
import freestyle.rpc.client._
import freestyle.rpc.client.implicits._
import monix.eval.Task
import io.grpc.ManagedChannel
import metrifier.rpc._
import metrifier.rpc.protocols._

import scala.concurrent.Future
import scala.util.{Failure, Success, Try}

package object client {

  trait ClientConf {

    val channelFor: ManagedChannelFor =
      ConfigForAddress[ChannelConfig.Op]("rpc.host", "rpc.port")
        .interpret[Try] match {
        case Success(c) => c
        case Failure(e) =>
          e.printStackTrace()
          throw new RuntimeException("Unable to load the client configuration", e)
      }

    val channelConfigList: List[ManagedChannelConfig] = List(UsePlaintext(true))

    val managedChannelInterpreter =
      new ManagedChannelInterpreter[Future](channelFor, channelConfigList)

    val channel: ManagedChannel = managedChannelInterpreter.build(channelFor, channelConfigList)

  }

  trait Implicits extends PersonServiceRuntime with ClientConf {

    implicit val personServicePBClient: PersonServicePB.Client[Task] =
      PersonServicePB.client[Task](channel)

    implicit val personServiceAvroClient: PersonServiceAvro.Client[Task] =
      PersonServiceAvro.client[Task](channel)
  }

  object implicits extends Implicits

}
