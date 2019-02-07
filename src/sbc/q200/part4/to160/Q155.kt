package sbc.q200.part4.to160

/*
    String 클래스 살펴보기
 */

fun main()
{
    val one = "Hello "
    val two = "Kotlin"
    val three = "JavaFx"

    println(one + two) // String 끼리 + 연산
    println(one > two) // 크기비교 할땐 우선 글자수(문자열의 길이)로 비교하고 길이가 같으면 유니코드 순서로 비교
    println(two > three)
}