package metrifier
package rpc
package client

import cats._
import metrifier.shared.model._
import protocols._

class RPCClientHandler[F[_]: Monad](
    implicit client: PersonService.Client[F],
    M: MonadError[F, Throwable])
    extends RPCClient.Handler[F] {

  override def listPersons: F[PersonList] = client.listPersons("foo")

  override def getPerson(id: String): F[Person] = client.getPerson(id)

  override def getPersonLinks(id: String): F[PersonLinkList] = client.getPersonLinks(id)

  override def createPerson(
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
      pictureThumbnail: Option[String] = None): F[Person] = {

    val picture: Option[Picture] = pictureLarge map (pl =>
      Picture(pl, pictureMedium.getOrElse(""), pictureThumbnail.getOrElse("")))

    val p: Person = Person(
      id = id,
      name = PersonName(title = nameTitle, first = nameFirst, last = nameLast),
      gender = gender,
      location = Location(
        street = locationStreet,
        city = locationStreet,
        state = locationState,
        postCode = locationPostCode),
      email = email,
      picture = picture
    )

    client.createPerson(p)
  }

}
