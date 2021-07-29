package com.github.seet61.chapter2

import java.time.ZoneId

fun main() {
    val name: String by lazy { getName() }
    println("hey1")
    lateinit var name2: String
    println("hey2")

    // init name 2
    name2 = getName()

    println(name)
    println(name2)
    println(name)
    println(name2)

    val person = Person("Dima")
    println("person name: ${person.name}" +
            " registered: ${person.registered.atZone(ZoneId.of("Europe/Moscow"))}")
}

fun getName(): String {
    println("computing name...")
    return "Mike"
}
