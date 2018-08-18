package com.github.kory33.atcoder.scala.abc106

object B {
  import io.StdIn._

  def getStrings = readLine().split(" ")
  def getInts = getStrings.map(_.toInt)

  def main(args: Array[String]): Unit = {
    val N = getInts(0)
    println((1 to N by 2).count(n => (1 to n).count(m => n % m == 0) == 8))
  }
}
