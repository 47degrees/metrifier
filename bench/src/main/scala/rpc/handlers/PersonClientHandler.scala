package metrifier
package rpc.handlers

import cats._
import cats.implicits._
import io.grpc.StatusRuntimeException
import journal.Logger
import metrifier.protocols._
import metrifier.rpc._


class SampleClientHandler[F[_]: Monad](
    implicit client: PersonService.Client[F],
    M: MonadError[F, Throwable])
    extends SampleClient.Handler[F] {

  val logger: Logger = Logger[this.type]

  override def listUsers: F[List[PersonProto]] =
    M.handleErrorWith {
      logger.info(s"*** listUsers ***")
      client.listUsers
        .map { persons: List[PersonProto] =>
          logger.info(s"Found '${persons.size}' persons: $persons")
        }
    } {
      case e: StatusRuntimeException =>
        logger.warn(s"RPC failed:${e.getStatus}", e)
        M.raiseError(e)
    }

  override def getUser(id: String): F[PersonProto] =
    M.handleErrorWith {
      logger.info(s"*** getUser($id) ***")
      client
        .getUser(id)
        .map { person: PersonProto =>
          logger.info(s"Found person with ID $id: $person")
        }
    } {
      case e: StatusRuntimeException =>
        logger.warn(s"RPC failed:${e.getStatus}", e)
        M.raiseError(e)
    }

  override def getPersonLinks(id: String): F[List[PersonLinkProto]] =
    M.handleErrorWith {
      logger.info(s"*** getPersonLinks($id) ***")
      client
        .getPersonLinks(id)
        .map { links: List[PersonLink] =>
          logger.info(s"Person with ID $id has '${links.size}' links: $links")
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
      pictureThumbnail: Option[String] = None): F[PersonProto] =
    M.handleErrorWith {
      logger.info(s"*** createPerson ***")

      val picture: Option[PictureProto] = pictureLarge map (pl =>
        PictureProto(pl, pictureMedium.getOrElse(""), pictureThumbnail.getOrElse("")))

      val p: Person = PersonProto(
        id = id,
        name = PersonNameProto(title = nameTitle, first = nameFirst, last = nameLast),
        gender = gender,
        location = LocationProto(
          street = locationStreet,
          city = locationStreet,
          state = locationState,
          postCode = locationPostCode),
        email = email,
        picture = picture
      )

      client
        .createPerson(p)
        .map { person: PersonProto =>
          logger.info(s"Person was created successfully $p")
        }
    } {
      case e: StatusRuntimeException =>
        logger.warn(s"RPC failed:${e.getStatus}", e)
        M.raiseError(e)
    }

}
