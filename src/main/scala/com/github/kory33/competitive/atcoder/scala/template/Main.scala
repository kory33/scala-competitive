package com.github.kory33.competitive.atcoder.scala.template

object Main {
  import java.util.Scanner

  implicit class RichScanner(sc: Scanner) {
    def readInts(n: Int): Array[Int] = Array.fill(n) { sc.nextInt() }
  }

  def main(args: Array[String]): Unit = solve(new Scanner(System.in))

  def solve(sc: Scanner): Unit = {

  }
}
