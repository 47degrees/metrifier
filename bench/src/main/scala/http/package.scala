package metrifier
package benchmark

import metrifier.http.client.HttpClient
import metrifier.http.server.HttpConf
import org.http4s.client.blaze.PooledHttp1Client

package object http {

  val client: HttpClient = new HttpClient(PooledHttp1Client(), HttpConf.host, HttpConf.port)

}
