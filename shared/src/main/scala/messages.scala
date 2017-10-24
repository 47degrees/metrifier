package metrifier

import argonaut.CodecJson
import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut.{jsonEncoderOf, jsonOf}


case class PersonList(persons: List[Person], count: Int) {

  def add(person: Person): PersonList = PersonList(persons = persons :+ person, count + 1)

}


case class PersonLinkList(links: List[PersonLink], count: Int)

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

object implicits {

  val host = "0.0.0.0"
  val port = 8080

  type PersonAggregation = (Person, Person, Person, Person, PersonLinkList, PersonLinkList, PersonList)

  //Argonaut Codecs
  implicit val arPersonNameCodec: CodecJson[PersonName] = CodecJson.derive[PersonName]
  implicit val arLocationCodec: CodecJson[Location] = CodecJson.derive[Location]
  implicit val arPictureCodec: CodecJson[Picture] = CodecJson.derive[Picture]
  implicit val arPersonCodec: CodecJson[Person] = CodecJson.derive[Person]
  implicit val arPersonLinkCodec: CodecJson[PersonLink] = CodecJson.derive[PersonLink]
  implicit val arPersonListCodec: CodecJson[PersonList] = CodecJson.derive[PersonList]
  implicit val arPersonLinkListCodec: CodecJson[PersonLinkList] = CodecJson.derive[PersonLinkList]

  //Encoders
  implicit val personNameEncoder: EntityEncoder[PersonName] = jsonEncoderOf[PersonName]
  implicit val locationEncoder: EntityEncoder[Location] = jsonEncoderOf[Location]
  implicit val pictureEncoder: EntityEncoder[Picture] = jsonEncoderOf[Picture]
  implicit val personEncoder: EntityEncoder[Person] = jsonEncoderOf[Person]
  implicit val personLinkEncoder: EntityEncoder[PersonLink] = jsonEncoderOf[PersonLink]
  implicit val personLinkListEncoder: EntityEncoder[List[PersonLink]] = jsonEncoderOf[List[PersonLink]]
  implicit val personListLinkListEncoder: EntityEncoder[PersonLinkList] = jsonEncoderOf[PersonLinkList]
  implicit val personListEncoder: EntityEncoder[PersonList] = jsonEncoderOf[PersonList]

  //Decoders
  implicit val personNameDecoder: EntityDecoder[PersonName] = jsonOf[PersonName]
  implicit val locationDecoder: EntityDecoder[Location] = jsonOf[Location]
  implicit val pictureDecoder: EntityDecoder[Picture] = jsonOf[Picture]
  implicit val personDecoder: EntityDecoder[Person] = jsonOf[Person]
  implicit val personLinkDecoder: EntityDecoder[PersonLink] = jsonOf[PersonLink]
  implicit val personLinkListDecoder: EntityDecoder[PersonLinkList] = jsonOf[PersonLinkList]
  implicit val personListDecoder: EntityDecoder[PersonList] = jsonOf[PersonList]


}