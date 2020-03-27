package metrifier
package http

import cats.effect.Sync
import io.circe.generic.auto._
import metrifier.shared.model._
import org.http4s._
import org.http4s.circe._
import org.http4s.dsl.io._

object codecs {

  //Encoders
  implicit def personNameEncoder[F[_]: Sync]: EntityEncoder[F, PersonName] =
    jsonEncoderOf[F, PersonName]
  implicit def locationEncoder[F[_]: Sync]: EntityEncoder[F, Location] = jsonEncoderOf[F, Location]
  implicit def pictureEncoder[F[_]: Sync]: EntityEncoder[F, Picture]   = jsonEncoderOf[F, Picture]
  implicit def personEncoder[F[_]: Sync]: EntityEncoder[F, Person]     = jsonEncoderOf[F, Person]
  implicit def personLinkEncoder[F[_]: Sync]: EntityEncoder[F, PersonLink] =
    jsonEncoderOf[F, PersonLink]
  implicit def personLinkListEncoder[F[_]: Sync]: EntityEncoder[F, List[PersonLink]] =
    jsonEncoderOf[F, List[PersonLink]]
  implicit def personListLinkListEncoder[F[_]: Sync]: EntityEncoder[F, PersonLinkList] =
    jsonEncoderOf[F, PersonLinkList]
  implicit def personListEncoder[F[_]: Sync]: EntityEncoder[F, PersonList] =
    jsonEncoderOf[F, PersonList]

  //Decoders
  implicit def personNameDecoder[F[_]: Sync]: EntityDecoder[F, PersonName] = jsonOf[F, PersonName]
  implicit def locationDecoder[F[_]: Sync]: EntityDecoder[F, Location]     = jsonOf[F, Location]
  implicit def pictureDecoder[F[_]: Sync]: EntityDecoder[F, Picture]       = jsonOf[F, Picture]
  implicit def personDecoder[F[_]: Sync]: EntityDecoder[F, Person]         = jsonOf[F, Person]
  implicit def personLinkDecoder[F[_]: Sync]: EntityDecoder[F, PersonLink] = jsonOf[F, PersonLink]
  implicit def personLinkListDecoder[F[_]: Sync]: EntityDecoder[F, PersonLinkList] =
    jsonOf[F, PersonLinkList]
  implicit def personListDecoder[F[_]: Sync]: EntityDecoder[F, PersonList] = jsonOf[F, PersonList]
}
