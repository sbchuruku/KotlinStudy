package sbc.q200.part3.to120

/*
    반복자
 */

fun main() {
    val range:IntRange = 1..3
    val iter:Iterator<Int> = range.iterator() // 기본적으로 선언된 반복자를 가져온다.

    println(iter.hasNext()) // Iterator 내부에 변수를 Cursor 라고 부르고, hasNext() 는 다음 원소의 유무를 반환
    println(iter.next()) // 다음 원소로 이동하고 원소를 반환

    println(iter.hasNext())
    println(iter.next())

    println(iter.hasNext())
    println(iter.next())

    println(iter.hasNext()) // 다음 원소가 없으면 false 리턴. 이후에 next() 를 호출하면 NoSuchElementException 발생
}