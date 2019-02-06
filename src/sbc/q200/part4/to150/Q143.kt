package sbc.q200.part4.to150

/*
    MutableListIterator 인터페이스 살펴보기
 */

fun main()
{
    val list = mutableListOf(1,2,3)
    val iter:MutableListIterator<Int> = list.listIterator()

    println(list)

    iter.next();iter.next() // 커서가 1을 가리키도록
    iter.add(7) // 커서가 가리키는 위치에 7 추가

    iter.next();iter.set(10) // 커서를 다음으로 옮기고 10 으로 수정
    println(list)
}