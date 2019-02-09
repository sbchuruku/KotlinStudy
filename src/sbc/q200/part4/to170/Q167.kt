package sbc.q200.part4.to170

/*
    BigDecimal 클래스 : 매우 작은 실수 보관하기
 */

fun main()
{
    val a = 3.0000000000003.toBigDecimal()
    val b = 4.0000000000004.toBigDecimal()
    println(a * b) // 소수점 자리가 아무리 길어도 실수값을 정확히 표현할 수 있다.
}