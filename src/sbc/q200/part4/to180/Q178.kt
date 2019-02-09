package sbc.q200.part4.to180

/*
    Any?.toString 확장 함수
 */

fun main()
{
    val empty:Int? = null
    val str:String = empty.toString() // empty 의 변수 타입이 Nullable 이기 때문에 Any?.toString 함수가 호출되고 "null" 이 저장
    println(str)
}