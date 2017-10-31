package metrifier
package http
import com.typesafe.config.{Config, ConfigFactory}

object HttpConf {

  lazy val conf: Config = ConfigFactory.load()

  lazy val host: String = conf.getString("http.host")
  lazy val port: Int    = conf.getInt("http.port")
}
