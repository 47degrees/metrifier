package metrifier
package rpc
package server

import freestyle.Capture
import metrifier.shared.model._
import metrifier.shared.services
import protocols._

class PersonServiceHandler[F[_]](implicit C: Capture[F]) extends PersonService.Handler[F] {

  override def listPersons(b: String): F[PersonList] = C.capture {
    services.listPersons
  }

  override def getPerson(id: String): F[Person] = C.capture {
    services.getPerson(id)
  }

  override def getPersonLinks(id: String): F[PersonLinkList] = C.capture {
    services.getPersonLinks(id)
  }

  override def createPerson(person: Person): F[Person] = C.capture {
    services.createPerson(person)
  }

}
