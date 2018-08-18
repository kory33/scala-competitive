package com.github.kory33.competitive.atcoder.scala.abc106.a

object Main {
  import io.StdIn._

  def getStrings = readLine().split(" ")
  def getInts = getStrings.map(_.toInt)

  def main(args: Array[String]): Unit = {
    val Array(a, b) = getInts
    println(a * b - a - b + 1)
  }
}
