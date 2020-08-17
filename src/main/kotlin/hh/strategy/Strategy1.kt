package hh.strategy

/**
 * 策略模式
 */
class Strategy1 : Strategy {
    override fun getString(a: MutableList<String>): String {
        val sb = StringBuilder("select * from user_info where ")
        var boolean = false
        a.forEach {
            if (boolean) {
                sb.append(" or ")
            }
            sb.append("username = '$it'")
            boolean = true
        }
        return "$sb"
    }
}