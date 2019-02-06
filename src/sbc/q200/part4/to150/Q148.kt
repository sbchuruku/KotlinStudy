package sbc.q200.part4.to150

/*
    컬렉션 중 원하는 원소 걸러내기
 */

fun main()
{
    val to50 = 1..50

    println(to50.filter { it % 4 == 0 }) // 4 의 배수만 남김
    println(to50.filterNot { it % 4 == 0 }) // 4 의 배수가 아닌 것만 남김
    println(to50.filterNotNull()) // null 이 아닌 원소만
    println(to50.filterIndexed { index, element -> element > 20 }) // 20 이 넘는 수만
    println(to50.filterIsInstance<Long>()) // 타입이 Long 인 것만
}