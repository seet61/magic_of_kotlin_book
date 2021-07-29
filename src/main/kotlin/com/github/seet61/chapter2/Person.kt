package com.github.seet61.chapter2

import java.time.Instant

class Person(val name: String, val registered: Instant = Instant.now()) {
}