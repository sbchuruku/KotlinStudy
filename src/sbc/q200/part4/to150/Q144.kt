package sbc.q200.part4.to150

/*
    MutableSet 인터페이스 살펴보기
 */

fun main()
{
    val set:MutableSet<Int> = mutableSetOf(1,5,7)
    println(set)

    println(set.add(5)) // 5 는 이미 존재하므로 추가되지 않고 false
    println(set)

    println(set.addAll(listOf(3,7))) // 7 은 존재하므로 3 만 추가되고 true
    println(set)
}