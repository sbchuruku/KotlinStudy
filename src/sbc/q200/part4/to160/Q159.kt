package sbc.q200.part4.to160

/*
    toList 확장 함수 : List 타입으로 변환하기
 */

fun main()
{
    // Pair 의 타입인수가 모두 같아야 한다.
    val list:List<Int> = Pair(10,20).toList() // Pair 객체를 List 로

    // Triple 의 타입인수가 모두 같아야 한다.
    val list2:List<Double> = Triple(3.1,6.25,8.15).toList() // Thriple 객체를 List 로
}