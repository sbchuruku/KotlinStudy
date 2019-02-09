package sbc.q200.part5

/*
    자바에서 코틀린 코드 접근하기 : 패키지 레벨 변수/함수
 */

val a = 10

fun func() = println("Hello")

fun Int.extension() = println(this)