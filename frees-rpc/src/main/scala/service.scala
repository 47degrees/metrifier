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

import freestyle._
import freestyle.rpc.protocol._

@option(name = "java_package", value = "metriefier", quote = true)
@option(name = "java_multiple_files", value = "true", quote = false)
@option(name = "java_outer_classname", value = "Metrifier", quote = true)
object protocols {

  @message
  case class PersonProto(
      id: String,
      name: PersonNameProto,
      gender: String,
      location: LocationProto,
      email: String,
      picture: Option[PictureProto])

  @message
  case class PersonNameProto(title: String, first: String, last: String)

  @message
  case class LocationProto(street: String, city: String, state: String, postCode: Int)

  @message
  case class PictureProto(large: String, medium: String, thumbnail: String)

  @message
  case class PersonLinkProto(p1: PersonProto, p2: PersonProto)

  @free
  @service
  @debug
  trait PersonService {

    @rpc def listUsers(b: Boolean): FS[List[PersonProto]]

    @rpc def getUser(id: String): FS[PersonProto]

    @rpc def getPersonLinks(id: String): FS[List[PersonLinkProto]]

    @rpc def createPerson(person: PersonProto): FS[PersonProto]

  }

}
