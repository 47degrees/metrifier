package metrifier
package rpc
package client

import cats._
import cats.implicits._
import io.grpc.StatusRuntimeException
import journal.Logger
import metrifier.shared.model._
import protocols._

class RPCClientHandler[F[_]: Monad](
    implicit client: PersonService.Client[F],
    M: MonadError[F, Throwable])
    extends RPCClient.Handler[F] {

  val logger: Logger = Logger[this.type]

  override def listPersons: F[PersonList] =
    M.handleErrorWith {
      logger.info(s"*** listPersons ***")
      client
        .listPersons("foo")
        .map { personList: PersonList =>
          logger.info(s"Found '${personList.count}' persons: ${personList.persons}")
          personList
        }
    } {
      case e: StatusRuntimeException =>
        logger.warn(s"RPC failed:${e.getStatus}", e)
        M.raiseError(e)
    }

  override def getPerson(id: String): F[Person] =
    M.handleErrorWith {
      logger.info(s"*** getPerson($id) ***")
      client
        .getPerson(id)
        .map { person: Person =>
          logger.info(s"Found person with ID $id: $person")
          person
        }
    } {
      case e: StatusRuntimeException =>
        logger.warn(s"RPC failed:${e.getStatus}", e)
        M.raiseError(e)
    }

  override def getPersonLinks(id: String): F[PersonLinkList] =
    M.handleErrorWith {
      logger.info(s"*** getPersonLinks($id) ***")
      client
        .getPersonLinks(id)
        .map { personLinkList: PersonLinkList =>
          logger.info(
            s"Person with ID $id has '${personLinkList.count}' links: ${personLinkList.links}")
          personLinkList
        }
    } {
      case e: StatusRuntimeException =>
        logger.warn(s"RPC failed:${e.getStatus}", e)
        M.raiseError(e)
    }

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
      pictureThumbnail: Option[String] = None): F[Person] =
    M.handleErrorWith {
      logger.info(s"*** createPerson ***")

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

      client
        .createPerson(p)
        .map { person: Person =>
          logger.info(s"Person was created successfully $p")
          person
        }
    } {
      case e: StatusRuntimeException =>
        logger.warn(s"RPC failed:${e.getStatus}", e)
        M.raiseError(e)
    }

}
