package com.ikempf.jsoncirce

import com.ikempf.jsoncirce.parsing.rawJson
import io.circe.parser.parse

object parsing {

  val rawJson: String =
    """
      |{
      | "key": "value"
      |}
    """.stripMargin

}

object Main extends App {
  println(parse(rawJson))
  println(parse("noJson"))
}
