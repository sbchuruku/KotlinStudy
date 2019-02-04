package sbc.q200.part4.to140

/*
    List 인터페이스 살펴보기
 */

fun main()
{
    val list:List<Double> = listOf(20.18,1.14,9.15,1.14)

    println(list[0]) // 0 번째 원소 출력
    println(list.indexOf(1.14)) // 1.14 와 일치하는 원소의 첫번째 인덱스 출력
    println(list.indexOf(9.31)) // 리스트에 없는 원소를 찾으면 -1
    println(list.lastIndexOf(1.14)) // 1.14 와 일치하는 마지막 원소 인덱스 출력
    println(list.subList(0,3)) // 0~2번 인덱스에 해당하는 원소로 새 리스트를 만들고 출력
}