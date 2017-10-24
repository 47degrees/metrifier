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


import org.http4s.Method._
import org.http4s.client.Client
import org.http4s.client.blaze.PooledHttp1Client
import org.http4s.{Request, Uri}

import metrifier.codecs._
import metrifier.model._

import scalaz.concurrent.Task

object ClientApp {

  def main(args: Array[String]): Unit = {

    val client = new HttpClient(PooledHttp1Client())

    val aggregation: Task[PersonAggregation] = for {
      personList <- client.listPersons
      p1         <- client.getPerson("1")
      p2         <- client.getPerson("2")
      p3         <- client.getPerson("3")
      p4         <- client.getPerson("4")
      p1Links    <- client.getPersonLinks(p1.id)
      p3Links    <- client.getPersonLinks(p3.id)
      pNew       <- client.createPerson(
        id = "5",
        nameTitle = "ms",
        nameFirst = "valentine",
        nameLast = "lacroix",
        gender = "female",
        locationStreet = "1494 avenue du fort-caire",
        locationCity = "orléans",
        locationState = "aveyron",
        locationPostCode = 91831,
        email = "valentine.lacroix@example.com",
        pictureLarge = None,
        pictureMedium = None,
        pictureThumbnail = None
      )
    } yield (p1, p2, p3, p4, p1Links, p3Links, personList.add(pNew))

//    val result: PersonAggregation = aggregation.unsafePerformSync
//
//    println(result)

  }


}


class HttpClient(c: Client) {

  def listPersons: Task[PersonList] = c.expect[PersonList](url("/person"))

  def getPerson(id: String): Task[Person]  = c.expect[Person](url(s"/person/$id"))

  def getPersonLinks(id: String): Task[PersonLinkList] =  c.expect[PersonLinkList](url(s"/person/$id/links"))

  def createPerson( id: String,
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

    val picture: Option[Picture] = pictureLarge map (pl => Picture(pl, pictureMedium.getOrElse(""), pictureThumbnail.getOrElse("")))
    val name: PersonName = PersonName(title = nameTitle, first = nameFirst, last = nameLast)
    val location: Location = Location(locationStreet, locationStreet, locationState, locationPostCode)
    val newPerson: Person = Person(id, name, gender, location, email, picture)

    c.expect[Person](Request(POST, url("/person")).withBody(newPerson))
  }


  def url(path: String): Uri = Uri(path = s"http://${HttpConf.host}:${HttpConf.port}$path")

}