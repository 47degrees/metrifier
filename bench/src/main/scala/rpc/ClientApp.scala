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
package rpc

import freestyle._
import metrifier.model._
import monix.eval.Task
import metrifier.rpc.client.implicits._

import scala.concurrent.Await
import scala.concurrent.duration._

@free
trait SampleClient {

  def listPersons: FS[PersonList]

  def getPerson(id: String): FS[Person]

  def getPersonLinks(id: String): FS[PersonLinkList]

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
      pictureThumbnail: Option[String] = None): FS[Person]

}

object ClientProgram {

  //TODO Proper PersonAggregation is defined at metrifier.implicits#PersonAggregation


  def clientProgram[M[_]](implicit APP: SampleClient[M]): FreeS[M, PersonAggregation] = {
    for {
      personList <- APP.listPersons
      p1         <- APP.getPerson("1")
      p2         <- APP.getPerson("2")
      p3         <- APP.getPerson("3")
      p4         <- APP.getPerson("4")
      p1Links    <- APP.getPersonLinks(p1.id)
      p3Links    <- APP.getPersonLinks(p3.id)
      pNew <- APP.createPerson(
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
  }
}

object ClientApp {

  def main(args: Array[String]): Unit = {

    val result: PersonAggregation = Await.result(
      ClientProgram.clientProgram[SampleClient.Op].interpret[Task].runAsync,
      Duration.Inf)

    println(s"Result = $result")

    System.in.read()
  }

}
