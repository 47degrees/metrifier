package metrifier
package handlers

import freestyle.Capture
import journal.Logger
import metrifier.model._
import metrifier.protocols._

class PersonServiceHandler[F[_]](implicit C: Capture[F]) extends PersonService.Handler[F] {

  val logger: Logger = Logger[this.type]

  override def listPersons(b: String): F[PersonList] = C.capture {
    logger.info(s" ### listPersons ### ")
    services.listPersons
  }

  override def getPerson(id: String): F[Person] = C.capture {
    logger.info(s" ### getPerson($id) ### ")
    services.getPerson(id)
  }

  override def getPersonLinks(id: String): F[PersonLinkList] = C.capture {
    logger.info(s" ### getPersonLinks($id) ### ")
    services.getPersonLinks(id)
  }

  override def createPerson(person: Person): F[Person] = C.capture {
    logger.info(s" ### createPerson($person) ### ")
    services.createPerson(person)
  }

}
