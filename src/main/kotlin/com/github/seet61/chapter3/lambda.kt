package com.github.seet61.chapter3

fun main() {
    println("double: ${double(1)}")
    println(("double2: ${double2(1)}"))
    println(("double3: ${doubleThenIncrement(1)}"))
    println(("double4: ${double4(1)}"))

    // ссылка на функцию
    println("mutliplyBy2: ${mutliplyBy2(1)}")
}

fun double(x: Int): Int = x * 2

val double2: (Int) -> Int = {x -> x * 2}

val doubleThenIncrement: (Int) -> Int = {x ->
    val double = x * 2
    double + 1
}

val double4: (Int) -> Int = { it *2 }

val mutliplyBy2: (Int) -> Int = ::double