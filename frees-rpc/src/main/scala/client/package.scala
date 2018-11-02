package metrifier
package rpc

import cats.effect.IO
import mu.rpc.ChannelFor
import mu.rpc.client.config.ConfigForAddress
import metrifier.rpc.protocols._

package object client {

  trait ClientConf {

    protected val channel: ChannelFor =
      ConfigForAddress[IO]("rpc.host", "rpc.port").unsafeRunSync()

  }

  trait Implicits extends PersonServiceRuntime with ClientConf {

    implicit val personServicePBClient: PersonServicePB.Client[IO] =
      PersonServicePB.client[IO](channel)

    implicit val personServiceAvroClient: PersonServiceAvro.Client[IO] =
      PersonServiceAvro.client[IO](channel)
  }

  object implicits extends Implicits

}
