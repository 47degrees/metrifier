package metrifier

object services {

  def listUsers: PersonList = {
    val search = database.persons
    PersonList(search, search.size)
  }

  def getUser(id: String): Person =
    database.persons.find(_.id == id).getOrElse(throw DatabaseException(s"User $id not found"))

  def getPersonLinks(id: String): PersonLinkList = {
    val search = database.personLinks.filter(link => link.p1.id == id || link.p2.id == id)
    PersonLinkList(search, search.size)
  }

  def createPerson(person: Person): Person = {
    // Simulating a IO blocking, it just sleep 100 ms
    Thread.sleep(100)
    person
  }
}
