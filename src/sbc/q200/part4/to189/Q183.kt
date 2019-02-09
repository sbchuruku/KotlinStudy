package sbc.q200.part4.to189

/*
    exitProcess 함수 : 어디서나 프로그램 종료하기
 */

import kotlin.system.exitProcess

fun main()
{
    something(-1)
    println("Hello")
}

fun something(num:Int)
{
    if (num < 0)
        exitProcess(0) // 입력받은수 0 보다 작으면 바로 종료
}