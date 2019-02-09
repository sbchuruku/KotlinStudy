package sbc.q200.part5

/*
    코틀린에서 자바 코드 접근하기 : 타입
 */

fun main()
{
    val rand:Double = Math.random() // Java Math 클래스 사용
    println(rand)

    val buffer:StringBuffer = StringBuffer() // Java 에서 쓰는 StringBuffer 사용
    buffer.append("Hello,")
    buffer.append("world!")
    val result:String = buffer.toString()
    println(result)
}