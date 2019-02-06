package sbc.q200.part4.to150

/*
    Sequence 인터페이스 살펴보기
 */

fun main()
{
    val seq:Sequence<Int> = sequenceOf(1,2,3)

    for (i in seq)
        print("$i ")
}