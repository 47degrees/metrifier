package metrifier
package rpc

import freestyle._
import freestyle.rpc.protocol._
import metrifier.shared.model._

@option(name = "java_package", value = "metriefier", quote = true)
@option(name = "java_multiple_files", value = "true", quote = false)
@option(name = "java_outer_classname", value = "Metrifier", quote = true)
object protocols {

  case class EmptyAvro(b: String = "")

  @free
  @service
  trait PersonServicePB {

    @rpc(Protobuf) def listPersons(empty: Empty): FS[PersonList]

    @rpc(Protobuf) def getPerson(id: PersonId): FS[Person]

    @rpc(Protobuf) def getPersonLinks(id: PersonId): FS[PersonLinkList]

    @rpc(Protobuf) def createPerson(person: Person): FS[Person]

  }

  @free
  @service
  trait PersonServiceAvro {

    @rpc(Avro) def listPersons(empty: EmptyAvro): FS[PersonList]

    @rpc(Avro) def getPerson(id: PersonId): FS[Person]

    @rpc(Avro) def getPersonLinks(id: PersonId): FS[PersonLinkList]

    @rpc(Avro) def createPerson(person: Person): FS[Person]

  }

}
