package sbc.q200.part2.to80

import java.lang.Exception

/*
    예외 던지기
 */

fun main(args: Array<String>) {

    try {
        something()
    } catch (e:Exception) {
        println(e.message)
    }

}

fun something() {
    val num1 = 10
    val num2 = 0
    div(num1, num2)
}

fun div(a:Int,b:Int):Int {
    if (b == 0)
        throw Exception("0으로 나눌 수 없습니다.")
    // Throwable 을 상속받은 Exception 을 던지는데 파라미터로 String 값을 전달하면 메세지로 전달
    return a / b
}