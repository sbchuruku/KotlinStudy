package sbc.q200.part4.to189

/*
    코드 성능 측정하기
 */

import kotlin.system.measureNanoTime
import kotlin.system.measureTimeMillis

fun main()
{
    println(measureTimeMillis {
        var sum = 0L
        for (i in 1..100000000)
            sum += i
    })

    println(measureNanoTime {
        var sum = 0L
        for (i in 1..100000000)
            sum += i
    })
}