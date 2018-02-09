package com.github.uuidcode.scala.test

import com.github.uuidcode.scala.test.domain.Person

object Main extends App {
  println("Hello, World")
  println(Hello.test())

  var person = new Person().setName("Test")
  println(person.getName)
}
