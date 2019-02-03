package sbc.q200.part3.to120

/*
    흐름제어 - 반복문 for
 */

fun main()
{
    // for 문에 사용되는 in 은 contains 연산자 멤버 함수에서 지원되는 in 하고는 다르다.
    for (i:Int in 1..10) // Iterator 타입의 인수인 Int 타입과 호환되는 타입의 변수만 for 문의 소괄호 속에 선언 가능
        println("$i ")
    println()

    for (i:Int in 1..10)
    {
        if (i > 5)
            break
        print("$i ")
    }
}