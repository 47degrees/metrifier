/*
 * Copyright 2017 47 Degrees, LLC. <http://www.47deg.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package metrifier
package http
package client

import org.http4s.Method._
import org.http4s.client.Client
import org.http4s.{Request, Uri}
import codecs._
import metrifier.shared.model._

import scalaz.concurrent.Task

class HttpClient(c: Client, host: String, port: Int) {

  private[this] val baseUrl = s"http://$host:$port"
  private[this] val baseUri: Uri = Uri
    .fromString(baseUrl)
    .fold(e => throw e, qValue => qValue) / "person"

  def listPersons: Task[PersonList] = c.expect[PersonList](baseUri)

  def getPerson(id: String): Task[Person] = c.expect[Person](baseUri / id)

  def getPersonLinks(id: String): Task[PersonLinkList] =
    c.expect[PersonLinkList](baseUri / id / "links")

  def createPerson(
      id: String,
      nameTitle: String,
      nameFirst: String,
      nameLast: String,
      gender: String,
      locationStreet: String,
      locationCity: String,
      locationState: String,
      locationPostCode: Int,
      email: String,
      pictureLarge: Option[String] = None,
      pictureMedium: Option[String] = None,
      pictureThumbnail: Option[String] = None): Task[Person] = {

    val picture: Option[Picture] = pictureLarge map (pl =>
      Picture(pl, pictureMedium.getOrElse(""), pictureThumbnail.getOrElse("")))
    val name: PersonName = PersonName(title = nameTitle, first = nameFirst, last = nameLast)
    val location: Location =
      Location(locationStreet, locationStreet, locationState, locationPostCode)
    val newPerson: Person = Person(id, name, gender, location, email, picture)

    c.expect[Person](Request(POST, baseUri).withBody(newPerson))
  }

}
