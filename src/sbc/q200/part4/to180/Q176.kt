package sbc.q200.part4.to180
/*
    toBits, toRawBits 확장 함수 : 실수 타입을 이진수 값으로 가져오기
 */
fun main()
{
    val normal = 10.0
    val infinite = 10.0 / 0
    val nan = 0.0 / 0

    println(normal.toBits().toString(2))
    println(infinite.toBits().toString(2))
    println(nan.toBits().toString(2))

    println(normal.toRawBits().toString(2))
    println(infinite.toRawBits().toString(2))
    println(nan.toRawBits().toString(2))
}