package metrifier
package rpc
package client

import freestyle.free
import metrifier.shared.model._

@free
trait RPCClient {

  def listPersons: FS[PersonList]

  def getPerson(id: String): FS[Person]

  def getPersonLinks(id: String): FS[PersonLinkList]

  def createPerson(
      id: String,
      nameTitle: String,
      nameFirst: String,
      nameLast: String,
      gender: String,
      locationStreet: String,
      locationCity: String,
      locationState: String,
      locationPostCode: Int,
      email: String,
      pictureLarge: Option[String] = None,
      pictureMedium: Option[String] = None,
      pictureThumbnail: Option[String] = None): FS[Person]

}
