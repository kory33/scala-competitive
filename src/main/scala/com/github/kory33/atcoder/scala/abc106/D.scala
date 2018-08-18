package com.github.kory33.atcoder.scala.abc106

import com.github.kory33.atcoder.scala.Markers.{TLE, notSolved}

import scala.collection.mutable

@notSolved[TLE]
object D {
  import io.StdIn._

  @inline def readStrings: Array[String] = readLine().split(" ")
  @inline def readInts: Array[Int] = readStrings.map(_.toInt)

  def main(args: Array[String]): Unit = {
    val Array(n, m, q) = readInts

    val mutableIntervals: Seq[mutable.Seq[Int]] = Seq.fill(n)(mutable.Seq.fill(n)(0))
    for (_ <- 1 to m) {
      val Array(l, r) = readInts
      mutableIntervals(l - 1)(r - 1) += 1
    }

    val summedInterval = mutableIntervals.map(_.scan(0)(_+_)).transpose.map(_.scan(0)(_+_)).transpose

    for (_ <- 1 to q) {
      val Array(l, r) = readInts
      println(summedInterval(r)(r) - summedInterval(l - 1)(r) - summedInterval(r)(l - 1) + summedInterval(l - 1)(l - 1))
    }

  }
}
