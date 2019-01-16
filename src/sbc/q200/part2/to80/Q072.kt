package sbc.q200.part2.to80

import java.lang.NumberFormatException

/*
    예외 처리
 */

fun main(args: Array<String>) {

    try {
        val str = "abcd"
        val num = str.toInt()

        println(num)
    } catch (e:NumberFormatException) { // 예외 타입일 경우 catch 블럭을 타게된다. catch 블럭은 여러개 일 수 있다.
        println("문자열을 숫자로 변경하지 못함")
    } finally { // 예외 여부 상관없이 무조건 실행
        println("프로그램 종료")
    }

}