package sbc.q200.part4.to170

import java.math.BigInteger

/*
    BigInteger 클래스 : 매우 큰 정수 보관하기
 */

fun main()
{
    val a = 78423343545.toBigInteger()
    val b = 25372465331.toBigInteger()

    println(a * b) // Long 의 표현범위를 넘는 값도 출력됨
    println(a + b * 936273.toBigInteger())
}