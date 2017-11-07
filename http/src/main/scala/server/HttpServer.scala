package metrifier
package http
package server

import org.http4s._
import org.http4s.argonaut._
import org.http4s.dsl._
import org.http4s.server.blaze._
import org.http4s.server.{Server, ServerApp}
import scalaz.concurrent.Task
import scalaz.{-\/, \/-}
import metrifier.shared.model._
import metrifier.shared.services._
import codecs._

object HttpServer extends ServerApp {

  override def server(args: List[String]): Task[Server] = for {
      b <- BlazeBuilder.bindHttp(HttpConf.port, HttpConf.host).mountService(httpServices, "/").start
      _ <- Task.delay(println(s"PersonService has started at ${HttpConf.host}:${HttpConf.port}"))
    } yield b


  val httpServices: HttpService = HttpService {
    case GET -> Root / "person" => Ok(Task.now(listPersons))
    case GET -> Root / "person" / id => Ok(Task.now(getPerson(PersonId(id))))
    case GET -> Root / "person" / id / "links" => Ok(Task.now(getPersonLinks(PersonId(id))))
    case req @ POST -> Root / "person" => req.attemptAs[Person].run flatMap {
        case -\/(failed) => BadRequest(failed.toString)
        case \/-(p) => Ok(Task.now(createPerson(p)))
      }
  }


}
