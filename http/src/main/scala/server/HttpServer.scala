package metrifier
package http
package server

import cats.effect._
import cats.syntax.functor._
import fs2.Stream
import metrifier.http.codecs._
import metrifier.shared.model._
import metrifier.shared.services._
import org.http4s._
import org.http4s.dsl.impl.Root
import org.http4s.dsl.io._
import org.http4s.implicits._
import org.http4s.server.blaze._

object HttpServer extends IOApp {

  def run(args: List[String]): IO[ExitCode] = (for {
    b <- BlazeServerBuilder[IO]
      .bindHttp(HttpConf.port, HttpConf.host)
      .withHttpApp(httpServices.orNotFound)
      .serve
    _ <- Stream.eval(IO(println(s"PersonService has started at ${HttpConf.host}:${HttpConf.port}")))
  } yield b)
    .compile
    .drain
    .as(ExitCode.Success)


  val httpServices: HttpRoutes[IO] = HttpRoutes.of[IO] {

    case GET -> Root / "person" => Ok(listPersons)
    case GET -> Root / "person" / id => Ok(getPerson(PersonId(id)))
    case GET -> Root / "person" / id / "links" => Ok(getPersonLinks(PersonId(id)))
    case req@POST -> Root / "person" =>
      req.attemptAs[Person].value flatMap {
        case Left(failed) => BadRequest(failed.toString)
        case Right(p) => Ok(createPerson(p))
      }
  }


}
