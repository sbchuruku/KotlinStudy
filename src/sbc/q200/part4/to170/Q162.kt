package sbc.q200.part4.to170

/*
    with 함수 : 코드 중복 줄이기
 */

fun main()
{
    val a = 3; val b =7
    with(a * b - b * a) { // with 함수는 receiver 로 받은 결과를 this 로 전달
        println(this)
        println(-this)
    }
}