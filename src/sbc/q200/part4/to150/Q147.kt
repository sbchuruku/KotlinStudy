package sbc.q200.part4.to150

/*
    컬렉션 원소 타입 변환하기
 */

fun main()
{
    val origin = listOf(65,66,67,68,69)

    println(origin.map { it.toChar() })

    println(origin.mapIndexed { index,
                                element -> println("[$index]:$element")
                                element.toChar() }) // 각 원소를 Char 타입으로 변환할 때마다 인덱스를 출력

    val to100 = 1..100
    println(to100.mapNotNull {
        if (it%3 == 0) it // 원소가 3의 배수이면 반환하고 아니면 null 을 반환하여 3의 배수만 남도록
        else null
    })
}