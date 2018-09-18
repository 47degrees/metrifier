package metrifier
package shared

import metrifier.shared.model._

object database {

  val p1: Person = Person(
    id = "1",
    name = PersonName(title = "mr", first = "romain", last = "hoogmoed"),
    gender = "male",
    location = Location(
      street = "1861 jan pieterszoon coenstraat",
      city = "maasdriel",
      state = "zeeland",
      postCode = 69217),
    email = "romain.hoogmoed@example.com",
    picture = None
  )

  val p2: Person = Person(
    id = "2",
    name = PersonName(title = "mademoiselle", first = "morgane", last = "lefebvre"),
    gender = "female",
    location = Location(
      street = "2260 rue de gerland",
      city = "vucherens",
      state = "graubünden",
      postCode = 2877),
    email = "morgane.lefebvre@example.com",
    picture = Some(
      Picture(
        large = "https://randomuser.me/api/portraits/women/62.jpg",
        medium = "https://randomuser.me/api/portraits/med/women/62.jpg",
        thumbnail = "https://randomuser.me/api/portraits/thumb/women/62.jpg"
      ))
  )

  val p3: Person = Person(
    id = "3",
    name = PersonName(title = "ms", first = "eva", last = "snyder"),
    gender = "female",
    location =
      Location(
        street = "8534 grove road",
        city = "mallow",
        state = "clare",
        postCode = 18863),
    email = "eva.snyder@example.com",
    picture = Some(
      Picture(
        large = "https://randomuser.me/api/portraits/women/84.jpg",
        medium = "https://randomuser.me/api/portraits/med/women/84.jpg",
        thumbnail = "https://randomuser.me/api/portraits/thumb/women/84.jpg"
      ))
  )

  val p4: Person = Person(
    id = "4",
    name = PersonName(title = "monsieur", first = "elliot", last = "bertrand"),
    gender = "male",
    location = Location(
      street = "2557 rue abel",
      city = "tolochenaz",
      state = "graubünden",
      postCode = 4629),
    email = "elliot.bertrand@example.com",
    picture = Some(
      Picture(
        large = "https://randomuser.me/api/portraits/men/30.jpg",
        medium = "https://randomuser.me/api/portraits/med/men/30.jpg",
        thumbnail = "https://randomuser.me/api/portraits/thumb/men/30.jpg"
      ))
  )

  val persons: List[Person] = List(p1, p2, p3, p4)

  val personLinks: List[PersonLink] = List(
    PersonLink(p1, p2),
    PersonLink(p1, p3),
    PersonLink(p2, p3),
    PersonLink(p4, p1)
  )

}
