package hh

import hh.ktx.*
import hh.strategy.Strategy1
import hh.strategy.Strategy2

fun main() {
//    println(0.0.toDoubleOrNull())
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
    10{
        println(it)
    }
    println(10000000000000L.f())
    println(getString(mutableListOf("a", "b", "c"), Strategy1()))
    println(getString(mutableListOf("a", "b", "c"), Strategy2()))
    checkNotNull("aaa") {

    }
    val array = arrayOf("a", "b", "c", "d", "e", "f", "g", "h", "i", "j")

    array.forEachIndexed { index, i ->
        print("$index _ $i ")
    }
}
