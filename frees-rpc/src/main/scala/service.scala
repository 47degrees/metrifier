package metrifier
package rpc

import freestyle.rpc.protocol._
import metrifier.shared.model._

object protocols {

  //TODO: replace lists with streaming

  @service
  trait PersonServicePB[F[_]] {

    @rpc(Protobuf) def listPersons(empty: Empty.type): F[PersonList]

    @rpc(Protobuf) def getPerson(id: PersonId): F[Person]

    @rpc(Protobuf) def getPersonLinks(id: PersonId): F[PersonLinkList]

    @rpc(Protobuf) def createPerson(person: Person): F[Person]

  }

  @service
  trait PersonServiceAvro[F[_]] {

    @rpc(Avro) def listPersons(empty: Empty.type): F[PersonList]

    @rpc(Avro) def getPerson(id: PersonId): F[Person]

    @rpc(Avro) def getPersonLinks(id: PersonId): F[PersonLinkList]

    @rpc(Avro) def createPerson(person: Person): F[Person]

  }

}
