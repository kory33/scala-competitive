package com.github.kory33.atcoder.scala.abc106

object A {
  import io.StdIn._

  def getStrings = readLine().split(" ")
  def getInts = getStrings.map(_.toInt)

  def main(args: Array[String]): Unit = {
    val Array(a, b) = getInts
    println(a * b - a - b + 1)
  }
}
