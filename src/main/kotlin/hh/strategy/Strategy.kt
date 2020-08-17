package hh.strategy

/**
 * 策略模式
 */
interface Strategy {
    fun getString(a: MutableList<String>): String
}