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
    case GET -> Root / "person" => getPeople.flatMap(Ok(_))
    case GET -> Root / "person" / id => getPerson(id).flatMap(Ok(_))
    case GET -> Root / "person" / id / "links" => getLinkedPeople(id).flatMap(Ok(_))
    case req @ POST -> Root / "person" / "link" =>
      req.attemptAs[Person].run flatMap {
        case -\/(failed) => BadRequest(failed.toString)
        case \/-(p) => addPerson(p).flatMap(Ok(_))
      }

  }

  def getPeople: Task[List[Person]] = Task.now(database.persons)

  def getPerson(id: String): Task[Person] = Task.fromDisjunction(database.persons.find(_.id == id).\/>(PersonNotFound(id)))

  def getLinkedPeople(id: String): Task[List[PersonLink]] = Task.now(database.personLinks.filter(link => link.p1.id == id || link.p2.id == id))

  def addPerson(p: Person): Task[Person] = {
    Thread.sleep(100)
    Task.now(p)
  }

  //Exceptions
  final case class PersonNotFound(id: String) extends RuntimeException(s"Unable to retrieve person: $id") with NoStackTrace

  //Argonaut Codecs
  implicit val arPersonNameEncoder: CodecJson[PersonName] = CodecJson.derive[PersonName]
  implicit val arLocationEncoder: CodecJson[Location] = CodecJson.derive[Location]
  implicit val arPictureEncoder: CodecJson[Picture] = CodecJson.derive[Picture]
  implicit val arPersonEncoder: CodecJson[Person] = CodecJson.derive[Person]
  implicit val arPersonLinkEncoder: CodecJson[PersonLink] = CodecJson.derive[PersonLink]

  //Decoders
  implicit val personNameEncoder: EntityEncoder[PersonName] = jsonEncoderOf[PersonName]
  implicit val locationEncoder: EntityEncoder[Location] = jsonEncoderOf[Location]
  implicit val pictureEncoder: EntityEncoder[Picture] = jsonEncoderOf[Picture]
  implicit val personEncoder: EntityEncoder[Person] = jsonEncoderOf[Person]
  implicit val personListEncoder: EntityEncoder[List[Person]] = jsonEncoderOf[List[Person]]

  //Encoders
  implicit val personNameDecoder: EntityDecoder[PersonName] = jsonOf[PersonName]
  implicit val locationDecoder: EntityDecoder[Location] = jsonOf[Location]
  implicit val pictureDecoder: EntityDecoder[Picture] = jsonOf[Picture]
  implicit val personDecoder: EntityDecoder[Person] = jsonOf[Person]


}
