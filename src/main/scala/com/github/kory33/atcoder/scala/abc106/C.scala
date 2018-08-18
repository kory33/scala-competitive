package com.github.kory33.atcoder.scala.abc106

object C {
  import io.StdIn._

  def getStrings = readLine().split(" ")
  def getInts = getStrings.map(_.toInt)

  def main(args: Array[String]): Unit = {
    val S = readLine
    val K = readLine.toLong
    val s = if (K < S.length) S.substring(0, K.toInt) else S
    println(s.toList.find(_ != '1').getOrElse('1'))
  }
}
