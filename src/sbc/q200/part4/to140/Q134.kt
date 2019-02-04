package sbc.q200.part4.to140

/*
    Progression 과 관련된 함수
 */

fun IntProgression.print()
{
    print("first: ${this.first}, ")
    print("last: ${this.last}, ")
    println("step: ${this.step}")

    for (i in this)
        print("$i ")
    println('\n')
}

fun main()
{
    val prog:IntProgression = 7 downTo 3 // 역순으로 진행하는 Progression 을 반환
    prog.print()

    val prog2:IntProgression = (3..7).reversed() // 원래의 Progression 을 뒤집는 역할. 결과적으로 역순과 같은 결과
    println(prog==prog2)
    prog2.print()

    val prog3:IntProgression = (1..10) step 3 // 3 씩 증가하여 진행하는 Progression
    prog3.print()

    val prog4:IntProgression = 10 downTo 2 step 3 // 역으로 3 씩 감소하는 Progression. 감소 하더라도 step 에 음수를 넣으면 안됨.
    prog4.print()

    val prog5:IntProgression = 2 until 5 // 시작/끝 으로 진행하는 Progression 을 반환
    prog5.print()
}