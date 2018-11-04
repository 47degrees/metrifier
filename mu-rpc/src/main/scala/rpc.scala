package metrifier
package rpc

trait PersonServiceRuntime {

  implicit val S: monix.execution.Scheduler =
    monix.execution.Scheduler.Implicits.global

}
