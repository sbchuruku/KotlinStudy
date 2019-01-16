package sbc.q200.part2.to80

/*
    엘비스 연산자
 */

fun main(args: Array<String>) {

    val number:Int? = null
    println(number?:0) // 좌측의 피연산자가 null이 아니면 값 그대로 쓰고, null 이면 우측의 피연산자로 대체

    val number2:Int? = 15
    println(number2?:0)

}