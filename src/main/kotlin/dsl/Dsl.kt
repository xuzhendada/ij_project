package dsl

/**
 * DSL写法
 */
class Dsl {
    private var onOk: (() -> Unit)? = null
    private var onCancel: ((request: Int) -> Unit)? = null

    infix fun onOk(block: () -> Unit) {
        onOk = block
    }

    infix fun onCancel(block: (request: Int) -> Unit) {
        onCancel = block
    }

    fun doOk() {
        onOk?.invoke()
    }

    fun doCancel(request: Int) {
        onCancel?.invoke(request)
    }
}

inline fun dsl(a: Boolean, crossinline dsl: Dsl.() -> Unit) {
    val dslResult = Dsl().apply(dsl)
    if (a) {
        dslResult.doOk()
    } else {
        dslResult.doCancel(2)
    }
}
