package sbc.q200.part4.to140

/*
    ListIterator 인터페이스 살펴보기
 */

private fun moveToNext(iter:ListIterator<Int>)
{
    print("${iter.hasPrevious()},")     // 이전 원소가 존재하는지 여부
    print("${iter.hasNext()},")         // 다음 원소가 존재하는지 여부
    print("${iter.previousIndex()},")   // 이전 원소의 인덱스
    print("${iter.nextIndex()},")       // 다음 원소의 인덱스
    println("${iter.next()}")           // 다음 원소를 반환 하고 이동
}

fun main()
{
    val iter:ListIterator<Int> = listOf(10,20,30).listIterator()

    moveToNext(iter)
    moveToNext(iter)
    moveToNext(iter)
}