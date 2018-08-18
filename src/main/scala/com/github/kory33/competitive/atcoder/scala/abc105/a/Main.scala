package com.github.kory33.competitive.atcoder.scala.abc105.a

object Main {
  def main(args: Array[String]): Unit = {
    val answer = io.StdIn.readInt() match {
      case n if n < 1200 => "ABC"
      case n if n < 2800 => "ARC"
      case _ => "AGC"
    }
    println(answer)
  }
}
