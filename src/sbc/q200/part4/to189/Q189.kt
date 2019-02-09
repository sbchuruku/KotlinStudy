package sbc.q200.part4.to189

/*
    synchronized 함수 : 쓰레드 동기화하기
 */

import kotlin.concurrent.thread

private var obj:Int = 0

private fun objPlus()
{
    for (i in 1..1000)
        synchronized(obj) {
            obj++
        }
}

fun main()
{
    thread { objPlus() }
    objPlus() // 두개의 쓰레드에서 obj 의 값을 동시에 증가
    Thread.sleep(100)
    println(obj)
}