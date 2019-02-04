package sbc.q200.part4.to140

/*
    Collection 인터페이스 살펴보기
 */

fun main() {
    val list:Collection<Int> = listOf(18,1,1,4)

    println(list.size) // 원소의 개수
    println(list.isEmpty()) // 비어있으면 true 비어있지 않으면 false
    println(18 in list) // 18 이 list 에 있는지.. contains 와 같은 역할

    for (i:Int in list) // 원소를 하나씩 순회하며 출력
        print("$i ")
}