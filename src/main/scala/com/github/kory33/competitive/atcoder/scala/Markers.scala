package com.github.kory33.competitive.atcoder.scala

object Markers {

  class notSolved[R <: UnsolvedReason] extends scala.annotation.StaticAnnotation

  sealed trait UnsolvedReason
  class TLE extends UnsolvedReason
  class WA extends UnsolvedReason
  class MLE extends UnsolvedReason
  class NotImplemented extends UnsolvedReason

}