package sbc.q200.part4.to180

/*
    Double 값 검증하기
 */

fun main()
{
    val a:Double = 0.0/0.0
    val b:Double = 7/0.0
    val c:Double = 3.2

    print("$a ")
    println(a.isNaN()) // 숫자인지

    print("$b ")
    println(b.isInfinite()) // 무한수인지

    print("$c ")
    println(c.isFinite()) // 정상값인지
}