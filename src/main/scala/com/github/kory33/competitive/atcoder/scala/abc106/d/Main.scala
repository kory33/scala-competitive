package com.github.kory33.competitive.atcoder.scala.abc106.d

object Main {
  import java.util.Scanner

  implicit class RichScanner(sc: Scanner) {
    def readInts(n: Int): Array[Int] = Array.fill(n) { sc.nextInt() }
  }

  def main(args: Array[String]): Unit = solve(new Scanner(System.in))

  def solve(sc: Scanner): Unit = {
    val Array(n, m, q) = sc.readInts(3)
    val LR = Array.fill(m)(sc.readInts(2))
    val Q = Array.fill(q)(sc.readInts(2))

    val mutableIntervals: Array[Array[Int]] = Array.fill(n)(Array.fill(n)(0))
    LR.foreach { case Array(l, r) => mutableIntervals(l - 1)(r - 1) += 1 }
    val summedInterval = mutableIntervals.map(_.scan(0)(_+_)).transpose.map(_.scan(0)(_+_)).transpose

    Q.foreach { case Array(l, r) =>
      println(summedInterval(r)(r) - summedInterval(l - 1)(r) - summedInterval(r)(l - 1) + summedInterval(l - 1)(l - 1))
    }
  }
}
