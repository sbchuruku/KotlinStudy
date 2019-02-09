package sbc.q200.part4.to189

/*
    timer 함수 : 타이머 생성하기
 */

import java.util.Timer
import kotlin.concurrent.timer

fun main()
{
    var i = 1
    val t:Timer = timer(initialDelay = 1500,period = 250) {
        println(i)
        i += 1
    }

    Thread.sleep(2400)
    t.cancel()
}