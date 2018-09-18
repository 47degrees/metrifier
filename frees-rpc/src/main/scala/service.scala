package metrifier
package rpc

import freestyle.rpc.protocol._
import metrifier.shared.model._

object protocols {

  //TODO: replace lists with streaming

  @service(Protobuf)
  trait PersonServicePB[F[_]] {

    def listPersons(empty: Empty.type): F[PersonList]

    def getPerson(id: PersonId): F[Person]

    def getPersonLinks(id: PersonId): F[PersonLinkList]

    def createPerson(person: Person): F[Person]

  }

  @service(Avro)
  trait PersonServiceAvro[F[_]] {

    def listPersons(empty: Empty.type): F[PersonList]

    def getPerson(id: PersonId): F[Person]

    def getPersonLinks(id: PersonId): F[PersonLinkList]

    def createPerson(person: Person): F[Person]

  }

}
