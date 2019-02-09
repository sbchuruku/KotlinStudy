package sbc.q200.part4.to189

/*
    thread 함수 : 쓰레드 생성하기
 */

import kotlin.concurrent.thread

fun main()
{
    thread(start = true) {
        print("Hello, ")
        Thread.sleep(1000)
        print("World!")
    }

    Thread.sleep(500)
    print("Kotlin ")
}