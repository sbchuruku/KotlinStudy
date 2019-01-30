package sbc.q200.part3.to100

/*
    다이아몬드 문제
 */

interface Parent{ fun follow():Unit }

interface Mother:Parent {
    override fun follow() = println("follow his mother")
}

interface Father:Parent {
    override fun follow() = println("follow his father")
}

class Child:Mother,Father {
    override fun follow() {
        println("A child decided to ")
        super<Mother>.follow() // Mother 의 Follow 를 호출
    }
}

fun main(args: Array<String>) {
    Child().follow()
}