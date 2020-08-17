package hh

import hh.ktx.*
import hh.strategy.Strategy1
import hh.strategy.Strategy2

fun main() {
    a(true) {
        println(it)
    }
    b { a, b ->
        println(a + b)
    }
    c({
        println(it)
    }, { a, b ->
        println(a + b)
    })
    d(false) {
        println("a")
    }
    "Iphone.com"{
        println(it)
    }
    e {
        println(it)
    }
    println(10000000000000L.f())
    println(getString(mutableListOf("a", "b", "c"), Strategy1()))
    println(getString(mutableListOf("a", "b", "c"), Strategy2()))
}
