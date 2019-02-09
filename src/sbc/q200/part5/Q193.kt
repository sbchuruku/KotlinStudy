package sbc.q200.part5

/*
    코틀린에서 자바 코드 접근하기 : SAM 변환
    SAM 이란 단일 추상 메서드(Single Abstract Method)의 줄임말. 메서드를 한개만 갖고있는 인터페이스(대표적으로 Runnable, Comparable)
 */

fun main()
{
    val runnable:Runnable = Runnable { println("SAM") }
    runnable.run()
}
