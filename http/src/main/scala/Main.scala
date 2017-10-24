package metrifier

import _root_.argonaut._
import org.http4s._
import org.http4s.argonaut._
import org.http4s.dsl._
import org.http4s.server.blaze._
import org.http4s.server.{Server, ServerApp}

import scala.util.control.NoStackTrace
import scalaz.concurrent.Task
import scalaz.syntax.std.option._
import scalaz.{-\/, \/-}


object Main extends ServerApp {

  val host = "0.0.0.0"
  val port = 8080

  override def server(args: List[String]): Task[Server] = for {
      b <- startBlazeServer(httpServices)
      _    <- printOutStarted
    } yield b


  def startBlazeServer(services: HttpService): Task[Server] = BlazeBuilder
    .bindHttp(port, host)
    .mountService(services, "/")
    .start

  val printOutStarted: Task[Unit] = Task.delay(println(s"PersonService has started at $host:$port"))

  val httpServices: HttpService = HttpService {
    case GET -> Root / "person" / id => getPerson(id).flatMap(Ok(_))
    case req @ POST -> Root / "person" / "link" =>
      req.attemptAs[Link2PeopleRequest].run flatMap {
        case -\/(failed) => BadRequest(failed.toString)
        case \/-(r) => link2People(r).flatMap(Ok(_))
      }

  }

  def getPerson(id: String): Task[Person] = Task.fromDisjunction(database.persons.find(_.id == id).\/>(PersonNotFound(id)))

  def link2People(req: Link2PeopleRequest): Task[Link2PeopleResponse] = for {
      p1 <- getPerson(req.id1)
      p2 <- getPerson(req.id2)
      link = PersonLink(p1, p2)
    } yield Link2PeopleResponse(link)

  //Exceptions
  final case class PersonNotFound(id: String) extends RuntimeException(s"Unable to retrieve person: $id") with NoStackTrace

  //Argonaut Codecs
  implicit val arPersonNameEncoder: CodecJson[PersonName] = CodecJson.derive[PersonName]
  implicit val arLocationEncoder: CodecJson[Location] = CodecJson.derive[Location]
  implicit val arPictureEncoder: CodecJson[Picture] = CodecJson.derive[Picture]
  implicit val arPersonEncoder: CodecJson[Person] = CodecJson.derive[Person]
  implicit val arPersonLinkEncoder: CodecJson[PersonLink] = CodecJson.derive[PersonLink]
  implicit val arLink2PeopleRequestEncoder: CodecJson[Link2PeopleRequest] = CodecJson.derive[Link2PeopleRequest]
  implicit val arLink2PeopleResponseEncoder: CodecJson[Link2PeopleResponse] = CodecJson.derive[Link2PeopleResponse]

  //Decoders
  implicit val personNameEncoder: EntityEncoder[PersonName] = jsonEncoderOf[PersonName]
  implicit val locationEncoder: EntityEncoder[Location] = jsonEncoderOf[Location]
  implicit val pictureEncoder: EntityEncoder[Picture] = jsonEncoderOf[Picture]
  implicit val personEncoder: EntityEncoder[Person] = jsonEncoderOf[Person]
  implicit val link2PeopleResponseEncoder: EntityEncoder[Link2PeopleResponse] = jsonEncoderOf[Link2PeopleResponse]

  //Encoders
  implicit val entityDecoder: EntityDecoder[Link2PeopleRequest] = jsonOf[Link2PeopleRequest]


}
