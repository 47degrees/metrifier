package metrifier
package rpc

import cats.Applicative
import cats.effect._
import cats.syntax.applicative._
import higherkindness.mu.rpc.protocol.Empty
import higherkindness.mu.rpc.server.{AddService, GrpcConfig}
import metrifier.rpc.protocols._
import metrifier.shared.model._
import metrifier.shared.services

package object server {

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

  trait CommonImplicits extends PersonServiceRuntime

  object proto {

    trait ProtoImplicits extends CommonImplicits {

      implicit private val personServicePBHandler: RPCProtoHandler[IO] = new RPCProtoHandler[IO]

      val grpcConfigsProto: IO[GrpcConfig] = PersonServicePB.bindService[IO].map(AddService)

    }

    object implicits extends ProtoImplicits
  }

  object avro {

    trait AvroImplicits extends CommonImplicits {

      implicit private val personServiceAvroHandler: RPCAvroHandler[IO] = new RPCAvroHandler[IO]

      val grpcConfigsAvro: IO[GrpcConfig] = PersonServiceAvro.bindService[IO].map(AddService)
    }

    object implicits extends AvroImplicits
  }

}
