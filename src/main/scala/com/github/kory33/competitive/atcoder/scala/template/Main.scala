package com.github.kory33.competitive.atcoder.scala.template

object Main {
  import java.util.Scanner

  implicit class RichScanner(sc: Scanner) {
    def readStrings(n: Int): Array[String] = Array.fill(n) { sc.next() }
    def readInts(n: Int): Array[Int] = Array.fill(n) { sc.nextInt() }
    def readLongs(n: Int): Array[Long] = Array.fill(n) { sc.nextLong() }
    def readLineStrings: Array[String] = sc.nextLine().split(' ')
    def readLineInts: Array[Int] = readLineStrings.map(_.toInt)
    def readLineLongs: Array[Long] = readLineStrings.map(_.toLong)
  }

  def main(args: Array[String]): Unit = solve(new Scanner(System.in))

  def solve(sc: Scanner): Unit = {

  }
}
