package com.github.seet61

fun main() {
    val x = add(mult(2,3), mult(4,5))
    println("x = $x")
}

fun add(a: Int, b: Int): Int {
    log(String.format("Returning ${a + b} as the result $a + $b"))
    return a + b
}

fun mult(a: Int, b: Int) = a + b

fun log(m: String) {
    println(m)
}