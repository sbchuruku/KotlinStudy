package sbc.q200.part3.to120

/*
    연산자와 범위 표현식
 */

fun main()
{
    // .. 연산자로 범위를 표현
    val oneToTen:IntRange = 1..10 // Int 클래스에 rangeTo 가 선언되어 있고 IntRange 타입의 값이 반환된다.
    println(5 in oneToTen) // IntRange 클래스는 contains 연산자 멤버함수를 갖고 있기 때문에 in 연산자 사용 가능

    val upperAtoZ:CharRange = 'A'..'Z' // CharRange 는 유니코드의 범위로 표현
    if ('C' in upperAtoZ)
        println("대문자 C 입니다.")

    if ('p' in 'a'..'z')
        println("소문자 p 입니다.")

    /*
        if (0 <= && num <= 100) 이런 문법을 if (num in 0..100) 으로 표현 가능
     */
}