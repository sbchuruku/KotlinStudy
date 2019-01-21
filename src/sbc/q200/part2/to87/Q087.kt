package sbc.q200.part2.to87

/*
    확장 프로퍼티
 */

// 문자열이 큰지 판단하는 확장 프로퍼티
val String.isLarge:Boolean // 확장 함수와 마찬가지로 리시버 타입을 적는다.
    get() = this.length >= 10

fun main(args: Array<String>) {
    println("1234567890".isLarge) // 함수가 아니라 프로퍼티이기 때문에 괄호를 쓰지 않음
    println("500원".isLarge)
}