package com.akkahttp
import akka.actor.ActorSystem
import akka.http.scaladsl.Http
import akka.http.scaladsl.marshallers.sprayjson.SprayJsonSupport
import akka.http.scaladsl.model.StatusCodes
import akka.http.scaladsl.server.{Directives, Route}
import akka.stream.ActorMaterializer
import spray.json.DefaultJsonProtocol

import scala.concurrent.Await


case class Greetings(message: String)

case class Status(status: Int)

trait Jsonconvert extends SprayJsonSupport with DefaultJsonProtocol {
  implicit val greetFormat = jsonFormat1(Greetings)
  implicit val statusFormat = jsonFormat1(Status)
}

class AkkaHttpService extends Directives with Jsonconvert {

  def routes(): Route = {
    path("greet" / Segment) { name =>
      get {
        complete(
          Greetings("Hello, " + name))
      }
    } ~
      path("health") {
        complete {
          Status(StatusCodes.OK.intValue)
        }
      }
  }
}

object HttpService {
  def main(args: Array[String]): Unit = {
    implicit val actorSystem = ActorSystem("system")
    implicit val actorMaterializer = ActorMaterializer()

    val route = new AkkaHttpService().routes()
    val port = 1234
    val request = Http().newServerAt("localhost", port).bind(route)
    import scala.concurrent.duration._
     Await.result(request,10.seconds)
    println(s"server started at ${port}")
  }

}