package sbc.q200.part3.to110

/*
    it 식별자
 */

fun main() {
    val instantFunc:(Int)->Unit = {
        println("Hello $it") // 람다식에서 Int 타입을 생략하면 it 이라는 특별한 식별자가 만들어지고 매개변수를 대체한다.
    }

    instantFunc(33)
}