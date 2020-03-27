package metrifier
package http
package client

import cats.effect._
import io.circe.generic.auto._
import io.circe.syntax._
import metrifier.http.codecs._
import metrifier.shared.model._
import org.http4s.circe._
import org.http4s.client.Client
import org.http4s._

class HttpClient[F[_]: Effect](c: Client[F], host: String, port: Int) {

  private[this] val baseUrl = s"http://$host:$port"
  private[this] val baseUri: Uri = Uri
    .fromString(baseUrl)
    .fold(e => throw e, qValue => qValue) / "person"

  def listPersons: F[PersonList] = c.expect[PersonList](baseUri)

  def getPerson(pId: PersonId): F[Person] = c.expect[Person](baseUri / pId.id)

  def getPersonLinks(pId: PersonId): F[PersonLinkList] =
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
      pictureThumbnail: Option[String] = None
  ): F[Person] = {

    val picture: Option[Picture] = pictureLarge map (pl =>
      Picture(pl, pictureMedium.getOrElse(""), pictureThumbnail.getOrElse(""))
    )
    val name: PersonName = PersonName(title = nameTitle, first = nameFirst, last = nameLast)
    val location: Location =
      Location(locationStreet, locationStreet, locationState, locationPostCode)
    val newPerson: Person = Person(id, name, gender, location, email, picture)

    val request: Request[F] = Request[F](Method.POST, baseUri)

    val req = request.withBody(newPerson.asJson)

    c.expect(req)

  }

  def shutdown(): Unit = c.shutdownNow()

}
