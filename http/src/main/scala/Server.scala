package metrifier

import _root_.argonaut._
import org.http4s._
import org.http4s.argonaut._
import org.http4s.dsl._
import org.http4s.server.blaze._
import org.http4s.server.{Server, ServerApp}
import scalaz.concurrent.Task
import scalaz.{-\/, \/-}
import metrifier.implicits._
import metrifier.services._


object Server extends ServerApp {

  override def server(args: List[String]): Task[Server] = for {
      b <- BlazeBuilder.bindHttp(port, host).mountService(httpServices, "/").start
      _ <- Task.delay(println(s"PersonService has started at $host:$port"))
    } yield b


  val httpServices: HttpService = HttpService {
    case GET -> Root / "person" => Ok(Task.now(listUsers))
    case GET -> Root / "person" / id => Ok(Task.now(getUser(id)))
    case GET -> Root / "person" / id / "links" => Ok(Task.now(getPersonLinks(id)))
    case req @ POST -> Root / "person" => req.attemptAs[Person].run flatMap {
        case -\/(failed) => BadRequest(failed.toString)
        case \/-(p) => Ok(Task.now(createPerson(p)))
      }
  }


}
