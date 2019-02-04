package sbc.q200.part4.to140

/*
    코틀린의 컬렉션
 */

fun main()
{
    val list:Collection<Int> = listOf(10,20,10) // listOf 는 List<T> 객체를 생성 List 는 Collection 을 상속 받기 때문에 문제 없음
    val set:Collection<Int> = setOf(1,2,3,2,3) // setOf 는 Set<T> 를 반환 이 역시 Collection 을 상속
    val map:Map<String,String> = mapOf("Apple" to "사과", "Banana" to "바나나") // mapOf 에서 "키" to "값"

    println(list)
    println(set)
    println(map)
}