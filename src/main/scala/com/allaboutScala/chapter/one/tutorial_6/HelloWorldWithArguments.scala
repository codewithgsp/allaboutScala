package com.allaboutScala.chapter.one.tutorial_6

/**
  * HelloWorldWithArguments
  */
object HelloWorldWithArguments extends App{

  println("Hello World with Arguments Scala Application")
  println("Command line arguments are :")

  // args is a collection of arguments {Array[String] => collections}
  // to make a collection to String, use args.mkString(sep=",")

  println(args.mkString(sep = ", "))
}
