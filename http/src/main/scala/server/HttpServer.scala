package metrifier
package http
package server

import cats.effect._
import fs2.StreamApp
import fs2.Stream
import metrifier.http.codecs._
import metrifier.shared.model._
import metrifier.shared.services._
import org.http4s._
import org.http4s.dsl.impl.Root
import org.http4s.dsl.io._
import org.http4s.blaze.server._

import scala.concurrent.ExecutionContext.Implicits.global

object HttpServer extends StreamApp[IO] {

  override def stream(
      args: List[String],
      requestShutdown: IO[Unit]
  ): fs2.Stream[IO, StreamApp.ExitCode] =
    for {
      b <-
        BlazeBuilder[IO]
          .bindHttp(HttpConf.port, HttpConf.host)
          .mountService(httpServices, "/")
          .serve
      _ <- Stream.eval(
        IO(println(s"PersonService has started at ${HttpConf.host}:${HttpConf.port}"))
      )
    } yield b

  val httpServices = HttpService[IO] {

    case GET -> Root / "person"                => Ok(listPersons)
    case GET -> Root / "person" / id           => Ok(getPerson(PersonId(id)))
    case GET -> Root / "person" / id / "links" => Ok(getPersonLinks(PersonId(id)))
    case req @ POST -> Root / "person" =>
      req.attemptAs[Person].value flatMap {
        case Left(failed) => BadRequest(failed.toString)
        case Right(p)     => Ok(createPerson(p))
      }
  }

}
