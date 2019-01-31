package sbc.q200.part3.to110

/*
    제네릭
 */

fun <T> toFunction(value:T):()->T = { value } // 제네릭이 적용된 함수. T타입 을 받아 T타입 으로 리턴하는 함수

fun main() {
    val func:()->Int = toFunction<Int>(1107) // Int 타입을 받아 Int 로 리턴
    println(func())
}