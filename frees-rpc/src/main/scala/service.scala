package metrifier
package rpc

import freestyle._
import freestyle.rpc.protocol._
import metrifier.shared.model._

@option(name = "java_package", value = "metriefier", quote = true)
@option(name = "java_multiple_files", value = "true", quote = false)
@option(name = "java_outer_classname", value = "Metrifier", quote = true)
object protocols {

  @free
  @service
  trait PersonService {

    @rpc def listPersons(b: String): FS[PersonList]

    @rpc def getPerson(id: String): FS[Person]

    @rpc def getPersonLinks(id: String): FS[PersonLinkList]

    @rpc def createPerson(person: Person): FS[Person]

  }

}
