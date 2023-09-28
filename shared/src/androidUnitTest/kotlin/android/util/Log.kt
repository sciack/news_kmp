@file:JvmName("Log")

package android.util


object Log {
    @JvmStatic
    fun d(tag: String, msg: String, ex: Throwable? = null): Int {
        val newMsg = Log.addException(ex, msg)
        println("DEBUG: $tag: $newMsg")
        return 0
    }

    @JvmStatic
    fun i(tag: String, msg: String, ex: Throwable? = null): Int {
        val newMsg = Log.addException(ex, msg)
        println("INFO: $tag: $newMsg")
        return 0
    }

    @JvmStatic
    fun w(tag: String, msg: String, ex: Throwable? = null): Int {
        val newMsg = Log.addException(ex, msg)
        println("WARN: $tag: $newMsg")
        return 0
    }

    @JvmStatic
    fun e(tag: String, msg: String, ex: Throwable? = null): Int {
        val newMsg = Log.addException(ex, msg)
        println("ERROR: $tag: $newMsg")
        return 0
    }

    private fun addException(ex: Throwable?, msg: String): String {
        val newMsg = if (ex != null) {
            "msg: ${ex.stackTraceToString()}"
        } else {
            msg
        }
        return newMsg
    }
}