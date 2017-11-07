package metrifier
package shared

import metrifier.shared.model._

object services {

  def listPersons: PersonList = {
    val search = database.persons
    PersonList(search, search.size)
  }

  def getPerson(pId: PersonId): Person =
    database.persons.find(_.id == pId.id).getOrElse(throw DatabaseException(s"User $pId not found"))

  def getPersonLinks(pId: PersonId): PersonLinkList = {
    val search = database.personLinks.filter(link => link.p1.id == pId.id || link.p2.id == pId.id)
    PersonLinkList(search, search.size)
  }

  def createPerson(person: Person): Person = person
}
