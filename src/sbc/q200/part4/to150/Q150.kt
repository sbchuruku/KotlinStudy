package sbc.q200.part4.to150

/*
    CharSequence 인터페이스 : 문자열과 관련된 클래스가 구현하는 뼈대 인터페이스
 */

fun main()
{
    val seq:CharSequence = "Hello"
    println(seq.length) // length 프로퍼티
    println(seq[2]) // 2번째 인덱스의 문자
    println(seq.subSequence(1,4)) // 1~4 구간의 인덱스의 문자
}