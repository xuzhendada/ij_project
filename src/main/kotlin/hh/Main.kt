package hh

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
}

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
