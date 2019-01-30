package sbc.q200.part3.to100
/*
    내부 클래스
 */
class Outer100(private val value:Int) {
    fun print() {
        println(this.value)
    }

    inner class Inner(private val innerValue:Int) { // inner 키워드를 사용해 내부클래스 정의
        fun print() {
            this@Outer100.print() // this@바깥클래스명 으로 바깥클래스의 인스턴스 접근 가능
            println(this.innerValue + this@Outer100.value)
        }
    }
}

fun main(args: Array<String>) {
    val instance:Outer100 = Outer100(610) // 바깥 클래스부터 생성
    val innerInstance:Outer100.Inner = instance.Inner(40)
    innerInstance.print()
}