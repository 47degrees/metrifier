package metrifier
package rpc

import scala.concurrent.ExecutionContext

trait PersonServiceEC {

  implicit val ec: ExecutionContext = ExecutionContext.Implicits.global
  implicit val S: monix.execution.Scheduler =
    monix.execution.Scheduler.Implicits.global

}

trait PersonServiceRuntime extends PersonServiceEC
