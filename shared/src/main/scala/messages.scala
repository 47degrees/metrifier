package metrifier

case class Person(
    id: PersonId,
    name: PersonName,
    gender: String,
    location: Location,
    email: String,
    picture: Option[Picture])

case class PersonId(name: String, value: String)

case class PersonName(title: String, first: String, last: String)

case class Location(street: String, city: String, state: String, postCode: Int)

case class Picture(large: String, medium: String, thumbnail: String)
