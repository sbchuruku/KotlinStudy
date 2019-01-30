package sbc.q200.part3.to90
/*
    동반자 객체
 */
class Person89 private constructor() {
    companion object { // 모든 인스턴스가 공유하는 객체 = static 과 같은 효과
        fun create():Person89 {
            countCreated += 1
            return Person89()
        }

        var countCreated = 0
            private set
    }
}

fun main() {
    val a = Person89.create()
    val b = Person89.create()
    println(Person89.countCreated)
}