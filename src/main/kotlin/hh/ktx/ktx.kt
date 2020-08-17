package hh.ktx

import hh.strategy.Strategy
import java.text.DecimalFormat

/**
 *  一些函数扩展的练习
 */

fun a(b: Boolean, callback: (Boolean) -> Unit = {}) {
    if (b) {
        callback.invoke(b)
    } else {
        println("$b")
    }
}

fun b(callback: (a: Int, b: Int) -> Unit) {
    callback.invoke(1, 2)
}

fun c(a: (Int) -> Unit, callback: (String, Int) -> Unit) {
    a.invoke(2)
    callback.invoke("c", 2)
}

fun d(b: Boolean, callback: () -> Unit) {
    if (b) {
        callback.invoke()
    }
}

inline operator fun String.invoke(block: (String) -> Unit) {
    block(this)
}

fun e(block: (String) -> Unit) {
    block.invoke("a")
}

fun Long.f(): String = DecimalFormat(",###").format(this)

fun getString(a: MutableList<String>, strategy: Strategy): String {
    return strategy.getString(a)
}
