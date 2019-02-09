package sbc.q200.part5

/*
    코틀린에서 자바 코드 접근하기 : 연산자 오버로딩
 */

fun main()
{
    val java = Q195JavaClass()

    println(13 in java) // Java 클래스의 contains 메서드가 호출됨
    println(java[13]) // Java 클래스의 get 메서드 호출
    println(java[28])
    println(java[18])
}