package metrifier
package rpc

import cats.effect.{IO, Resource}
import higherkindness.mu.rpc.ChannelFor
import higherkindness.mu.rpc.config.channel.ConfigForAddress
import metrifier.rpc.protocols._

package object client {

  trait ClientConf {

    protected val channel: ChannelFor =
      ConfigForAddress[IO]("rpc.host", "rpc.port").unsafeRunSync()

  }

  trait Implicits extends PersonServiceRuntime with ClientConf {

    val personServicePBClient: Resource[IO, PersonServicePB[IO]] =
      PersonServicePB.client[IO](channel)

    val personServiceAvroClient: Resource[IO, PersonServiceAvro[IO]] =
      PersonServiceAvro.client[IO](channel)
  }

  object implicits extends Implicits

}
