package metrifier
package http

import metrifier.shared.model._
import argonaut.CodecJson
import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut.{jsonEncoderOf, jsonOf}

object codecs {

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
