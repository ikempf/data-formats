package com.ikempf.jsoncirce

import com.ikempf.domain.Person
import io.circe.Decoder
import io.circe.Decoder.Result
import io.circe.HCursor
import io.circe.parser.decode

object encoding {

  implicit val personDecoder: Decoder[Person] = new Decoder[Person] {
    override def apply(c: HCursor): Result[Person] = ???
  }

}

object Main extends App {
  println(decode[Person](""))
}