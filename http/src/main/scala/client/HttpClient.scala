package metrifier
package http
package client

import org.http4s.Method._
import org.http4s.client.Client
import org.http4s.{Request, Uri}
import codecs._
import metrifier.shared.model._

import scalaz.concurrent.Task

class HttpClient(c: Client, host: String, port: Int) {

  private[this] val baseUrl = s"http://$host:$port"
  private[this] val baseUri: Uri = Uri
    .fromString(baseUrl)
    .fold(e => throw e, qValue => qValue) / "person"

  def listPersons: Task[PersonList] = c.expect[PersonList](baseUri)

  def getPerson(pId: PersonId): Task[Person] = c.expect[Person](baseUri / pId.id)

  def getPersonLinks(pId: PersonId): Task[PersonLinkList] =
    c.expect[PersonLinkList](baseUri / pId.id / "links")

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
      pictureThumbnail: Option[String] = None): Task[Person] = {

    val picture: Option[Picture] = pictureLarge map (pl =>
      Picture(pl, pictureMedium.getOrElse(""), pictureThumbnail.getOrElse("")))
    val name: PersonName = PersonName(title = nameTitle, first = nameFirst, last = nameLast)
    val location: Location =
      Location(locationStreet, locationStreet, locationState, locationPostCode)
    val newPerson: Person = Person(id, name, gender, location, email, picture)

    c.expect[Person](Request(POST, baseUri).withBody(newPerson))
  }

}
