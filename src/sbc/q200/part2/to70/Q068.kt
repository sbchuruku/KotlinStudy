package sbc.q200.part2.to70

/*
    다형성의 활용
 */

open class AAA68 {
    open fun hello() = println("AAA 입니다.")
}

class BBB68:AAA68() {
    override fun hello() = println("BBB 입니다.")
}

fun main(args: Array<String>) {
    val one = AAA68()
    val two = BBB68()
    val three:AAA68 = two

    one.hello()
    two.hello()
    three.hello() // AAA68 타입이지만 BBB68 의 인스턴스를 갖고 있기 때문에 BBB68의 멤버함수 hello 를 호출한다.
}