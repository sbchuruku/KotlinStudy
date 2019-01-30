package sbc.q200.part3.to100
/*
    중첩 클래스
 */
class Outer { // 바깥 클래스
    class Nested { // 중첩 클래스
        fun hello() = println("중첩된 클래스")
    }
}

fun main(args: Array<String>) {
    // Outer 인스턴스와 Outer.Nested 인스턴스는 서로 어더한 프로퍼티나 멤버함수도
    // 공유하지 않는 별개의 클래스이다.
    val instance:Outer.Nested = Outer.Nested()
    instance.hello()
}