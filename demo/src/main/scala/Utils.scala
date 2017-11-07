package metrifier
package demo

import metrifier.shared.model._

object Utils {

  val person: Person = Person(
    id = "5",
    name = PersonName(title = "ms", first = "valentine", last = "lacroix"),
    gender = "female",
    location = Location(
      street = "1494 avenue du fort-caire",
      city = "orléans",
      state = "aveyron",
      postCode = 91831),
    email = "valentine.lacroix@example.com",
    picture = None
  )
}
