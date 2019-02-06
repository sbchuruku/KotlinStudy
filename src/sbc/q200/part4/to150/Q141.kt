package sbc.q200.part4.to150

/*
    MutableIterator 인터페이스 살펴보기
 */

fun main()
{
    val list = mutableListOf(1,2,3)
    val iter:MutableIterator<Int> = list.iterator()

    println(list)

    iter.next();iter.remove() // 커서가 가리키고 있는 원소를 삭제할 수 있는 remove 멤버함수가 있음
    println(list)

    iter.next();iter.remove()
    println(list)
}