package com.allaboutScala.chapter.two

object ScalaBasicTutorial extends App{

  // Immutable declaration
  // val once declared, cannot be reassigned -> "Reassignment to val"
  val donutsToBuy: Int = 5

  // Mutable declaration -> only for loops, should not be extensively used
  var favouriteDonut: String = "Glazed Donut"
  favouriteDonut = "Vanilla Donut"

  //Lazy evaluation -> delay the initialization until at the point where it consumed by the code base
  lazy val donutService: String = "Initialize some donut service"

  // Scala supported data types
  val donutsBought: Int = 5
  val bigNumberOfDonuts: BigDecimal = 1000000000000L
  val smallNumberOfDonuts: Short = 1
  val priceOfDonut: Double = 2.50
  val donutPrice: Float = 2.50f
  val donutStoreName: String = "AllaboutScala Dout Store"
  var donutByte: Byte = _
  val donutFirstLetter: Char = 'D'
  val nothing:Unit = ()

  // Declare value with no initialization
  var leastFavouriteDonut:String = _
  leastFavouriteDonut = "Plain Donut"

}
