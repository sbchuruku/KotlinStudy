package sbc.q200.part3.to110

/*
    함수 리터럴과 람다식
 */

fun main() {
    val instantFunc:(Int)->Unit // 함수 타입 : 매개변수가 Int 이고 반환타입이 Unit 인 함수를 저장할 수 있는 타입
    instantFunc = {
        // 함수 리터럴 : 함수를 나타내는 리터럴
        // 함수 리터럴의 형태중 아래와 같이 { 매개변수 -> 반환값 } 같은 형태를 람다식 이라고 한다.
        number:Int -> println("Hello $number")
    }

    instantFunc(33)
    instantFunc.invoke(33)
}