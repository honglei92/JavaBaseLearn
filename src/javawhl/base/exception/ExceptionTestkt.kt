package javawhl.base.exception

/**
 *
 *author:https://github.com/honglei92
 *time:2018/7/12
 */

class ExceptionTestkt {
    var name: String? = null
    fun printMessage() {
//        name = "Exception"
        try {
            System.out.print(name!!.length)
        } catch (e: Exception) {
            e.printStackTrace()
        } finally {
            System.out.print("ok  ok")
        }
    }
}

fun main(args: Array<String>) {
    var mExceptionTest = ExceptionTestkt()
    mExceptionTest.printMessage()
}