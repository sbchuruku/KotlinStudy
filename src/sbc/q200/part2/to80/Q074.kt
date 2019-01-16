package sbc.q200.part2.to80

/*
    Nothing 타입
 */

fun throwing():Nothing = throw Exception() // Nothing 은 throw 를 표현식으로 쓰기위한 장치

fun main(args: Array<String>) {
    println("start")
    val i:Int = throwing()
    println(i)
}