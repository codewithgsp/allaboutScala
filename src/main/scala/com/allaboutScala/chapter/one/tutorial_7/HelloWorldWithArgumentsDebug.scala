package com.allaboutScala.chapter.one.tutorial_7

/**
  * print Arguments with debugger - Debug
  */
object HelloWorldWithArgumentsDebug extends App{

  println("Hello World with Arguments Scala Application")
  println("Command line arguments are: ")
  println(args.mkString(sep = ", "))

}
