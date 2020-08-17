package hh.strategy

/**
 * 策略模式
 */
class Strategy2 : Strategy {
    override fun getString(a: MutableList<String>): String {
        val sb = StringBuilder("select * from user_info where ")
        a.forEach {
            sb.append("username = '$it'")
            sb.append(" or ")
        }
        sb.delete(sb.length - " or ".length, sb.length)
        return "$sb"
    }
}