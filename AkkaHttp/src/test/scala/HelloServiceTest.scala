

package com.akkahttp
import akka.http.scaladsl.testkit.ScalatestRouteTest
import org.scalatest.{FlatSpec, Matchers}

import scala.language.postfixOps

class AkkaHttpServiceSpec extends FlatSpec with Matchers with ScalatestRouteTest {

  "The service" should "return status code 200" in {

    Get("/greet/hema") ~> new AkkaHttpService().routes() ~> check {

      responseAs[String] shouldEqual   "{\"message\":\"Hello, hema\"}"
    }
  }
  "The service" should "greet the given user" in {

    Get("/health") ~> new AkkaHttpService().routes() ~> check {

      responseAs[String] shouldEqual   "{\"status\":200}"
    }
  }

}