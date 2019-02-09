package sbc.q200.part5

/*
    코틀린에서 자바 코드 접근하기 : 키워드 충돌
 */

import java.util.*

fun main()
{
    // 코틀린에서 in 키워드를 쓰기 때문에 Java 의 System.in 을 쓸수 없는데 `` 로 감싸면 사용가능
    val scanner:Scanner = Scanner(System.`in`)
}