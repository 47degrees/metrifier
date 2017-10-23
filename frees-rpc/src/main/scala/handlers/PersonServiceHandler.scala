package metrifier
package handlers

import freestyle.Capture
import journal.Logger
import metrifier.protocols._

class PersonServiceHandler[F[_]](implicit C: Capture[F]) extends PersonService.Handler[F] {

  import syntax._

  val logger: Logger = Logger[this.type]

  override def listUsers(b: Boolean): F[List[PersonProto]] = C.capture {
    logger.info(s" ### listUsers ### ")
    services.listUsers.map(_.toProto)
  }

  override def getUser(id: String): F[PersonProto] = C.capture {
    logger.info(s" ### getUser($id) ### ")
    services.getUser(id).toProto
  }

  override def getPersonLinks(id: String): F[List[PersonLinkProto]] = C.capture {
    logger.info(s" ### getPersonLinks($id) ### ")
    services.getPersonLinks(id).map(_.toProto)
  }

  override def createPerson(person: PersonProto): F[PersonProto] = C.capture {
    logger.info(s" ### createPerson($person) ### ")
    services.createPerson(person.fromProto).toProto
  }
}

object syntax {

  implicit def personOps(p: Person): PersonOps                      = new PersonOps(p)
  implicit def personProtoOps(p: PersonProto): PersonProtoOps       = new PersonProtoOps(p)
  implicit def personNameOps(p: PersonName): PersonNameOps          = new PersonNameOps(p)
  implicit def personNOps(p: PersonNameProto): PersonN              = new PersonN(p)
  implicit def locationOps(p: Location): LocationOps                = new LocationOps(p)
  implicit def locationProtoOps(p: LocationProto): LocationProtoOps = new LocationProtoOps(p)
  implicit def pictureOps(p: Picture): PictureOps                   = new PictureOps(p)
  implicit def pictureProtoOps(p: PictureProto): PictureProtoOps    = new PictureProtoOps(p)
  implicit def personLinkOps(p: PersonLink): PersonLinkOps          = new PersonLinkOps(p)

  final class PersonOps(p: Person) {

    def toProto: PersonProto =
      PersonProto(
        id = p.id,
        name = p.name.toProto,
        gender = p.gender,
        p.location.toProto,
        p.email,
        p.picture.map(_.toProto))

  }

  final class PersonProtoOps(p: PersonProto) {

    def fromProto: Person =
      Person(
        id = p.id,
        name = p.name.fromProto,
        gender = p.gender,
        p.location.fromProto,
        p.email,
        p.picture.map(_.fromProto))

  }

  final class PersonNameOps(p: PersonName) {

    def toProto: PersonNameProto = PersonNameProto(p.title, p.first, p.last)

  }

  final class PersonN(p: PersonNameProto) {

    def fromProto: PersonName = PersonName(p.title, p.first, p.last)

  }

  final class LocationOps(p: Location) {

    def toProto: LocationProto = LocationProto(p.street, p.city, p.state, p.postCode)

  }

  final class LocationProtoOps(p: LocationProto) {

    def fromProto: Location = Location(p.street, p.city, p.state, p.postCode)

  }

  final class PictureOps(p: Picture) {

    def toProto: PictureProto = PictureProto(p.large, p.medium, p.thumbnail)

  }

  final class PictureProtoOps(p: PictureProto) {

    def fromProto: Picture = Picture(p.large, p.medium, p.thumbnail)

  }

  final class PersonLinkOps(p: PersonLink) {

    def toProto: PersonLinkProto = PersonLinkProto(p.p1.toProto, p.p2.toProto)

  }

}
