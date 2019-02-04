package sbc.q200.part4.to140

/*
    Iterable 인터페이스 : 클래스가 반복자를 지원하도록 하기
 */

fun main()
{
    /*
        Range 는 수의 범위를 표현하고 Progression 은 수의 진행을 표현
     */
    val prog:IntProgression = 3..7
    println(prog.first)
    println(prog.last)
    println(prog.step) // 몇 칸씩 건너뛸 것인가.. 기본값 1

    for (i in prog)
        print("$i ")
}