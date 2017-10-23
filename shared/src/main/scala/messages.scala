package metrifier

case class Person(
    id: String,
    name: PersonName,
    gender: String,
    location: Location,
    email: String,
    picture: Option[Picture])

case class PersonName(title: String, first: String, last: String)

case class Location(street: String, city: String, state: String, postCode: Int)

case class Picture(large: String, medium: String, thumbnail: String)

case class PersonLink(p1: Person, p2: Person)

case class DatabaseException(message: String, maybeCause: Option[Throwable] = None)
    extends RuntimeException(message) {

  maybeCause foreach initCause

}
