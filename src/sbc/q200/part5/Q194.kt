package sbc.q200.part5

/*
    코틀린에서 자바 코드 접근하기 : Getter/Setter
 */

fun main()
{
    val java = Q194JavaClass()

    java.something = 301 // Java 클래스에 getter/setter 가 같은 타입의 값을 다루면 그 타입의 프로퍼티로 인식
    println(java.something)

    println(java.isGood) // 리턴타입이 boolean 이면 프로퍼티로 접근 가능
    println(java.doubleValue) // getter 메서드만 있어도 프로퍼티로 접근 가능


}