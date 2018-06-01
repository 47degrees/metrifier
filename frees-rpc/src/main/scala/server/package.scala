package metrifier
package rpc

import cats.Applicative
import cats.effect._
import cats.syntax.applicative._
import freestyle.free.config.implicits._
import freestyle.rpc.ChannelForAddress
import freestyle.rpc.client.config._
import freestyle.rpc.protocol.Empty
import freestyle.rpc.server._
import metrifier.rpc.protocols._
import metrifier.shared.model._
import metrifier.shared.services

package object server {

  trait ServerConf {

    protected val getConf: ChannelForAddress =
      ConfigForAddress[IO]("", "rpc.port").unsafeRunSync()

  }

  abstract class HandlerImpl[F[_]: Applicative] {

    def listPersons(b: Empty.type): F[PersonList] =
      services.listPersons.pure

    def getPerson(id: PersonId): F[Person] =
      services.getPerson(id).pure

    def getPersonLinks(id: PersonId): F[PersonLinkList] =
      services.getPersonLinks(id).pure

    def createPerson(person: Person): F[Person] =
      services.createPerson(person).pure
  }

  class RPCProtoHandler[F[_]: Applicative] extends HandlerImpl[F] with PersonServicePB[F]

  class RPCAvroHandler[F[_]: Applicative] extends HandlerImpl[F] with PersonServiceAvro[F]

  trait CommonImplicits extends PersonServiceRuntime with ServerConf

  object proto {

    trait ProtoImplicits extends CommonImplicits {

      implicit private val personServicePBHandler: RPCProtoHandler[IO] = new RPCProtoHandler[IO]

      implicit val pbServer: ServerW =
        ServerW.default(getConf.port, List(AddService(PersonServicePB.bindService[IO])))
    }

    object implicits extends ProtoImplicits
  }

  object avro {

    trait AvroImplicits extends CommonImplicits {

      implicit private val personServiceAvroHandler: RPCAvroHandler[IO] = new RPCAvroHandler[IO]

      implicit val avroServer: ServerW =
        ServerW.default(getConf.port, List(AddService(PersonServiceAvro.bindService[IO])))

    }

    object implicits extends AvroImplicits
  }

}
