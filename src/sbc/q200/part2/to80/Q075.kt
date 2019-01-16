package sbc.q200.part2.to80

import sbc.q200.part2.to70.Person65

/*
    Nullable 타입과 null
    자바에서는 기본적으로 변수에 null 을 지정할 수 있지만 코틀린에서는 Nullable 타입이 아니면 null 을 지정하지 못함
 */

fun main(args: Array<String>) {
    var person:Person65? = Person65("K",30) // ? 를 붙이면 null값을 지정할 수 있는 Nullable 한 변수
    person = null // 상단에 생성 후 null 을 지정하여 생성된 인스턴스는 힙영역에 남아있음

    var num:Int? = null
    num = 10
}