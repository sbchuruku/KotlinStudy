package sbc.q200.part4.to140

/*
    ClosedRange 인터페이스 : 닫힌 구간을 표현하는 인터페이스
 */

fun main()
{
    val intRange:IntRange = 1..10
    val longRange:LongRange = 1L..100L
    val charRange:CharRange = 'A'..'Z'

    println(intRange.start) // start 는 최소값
    println(longRange.endInclusive) // endInclusive 는 최대값
    println('*' in charRange)
    println(charRange.isEmpty())
}