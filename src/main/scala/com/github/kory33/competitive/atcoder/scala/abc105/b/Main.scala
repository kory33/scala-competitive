package com.github.kory33.competitive.atcoder.scala.abc105.b

object Main {
  def main(args: Array[String]): Unit = {
    val S = io.StdIn.readLine()
    if (S.startsWith("A") && S.substring(2, S.length - 1).count(_ == 'C') == 1 && S.count(_.isUpper) == 2) {
      println("AC")
    } else {
      println("WA")
    }
  }
}
