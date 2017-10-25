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
package demo
package http

import org.http4s.client.blaze.PooledHttp1Client
import metrifier.http.client._
import metrifier.http.codecs._
import metrifier.http.server.HttpConf
import metrifier.shared.model._

import scalaz.concurrent.Task

object ClientApp {

  def main(args: Array[String]): Unit = {

    val client = new HttpClient(PooledHttp1Client(), HttpConf.host, HttpConf.port)

    val aggregation: Task[PersonAggregation] = for {
      personList <- client.listPersons
      p1         <- client.getPerson("1")
      p2         <- client.getPerson("2")
      p3         <- client.getPerson("3")
      p4         <- client.getPerson("4")
      p1Links    <- client.getPersonLinks(p1.id)
      p3Links    <- client.getPersonLinks(p3.id)
      pNew <- client.createPerson(
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

    val result: PersonAggregation = aggregation.unsafePerformSync

    println(s"Result = $result")

  }

}
