package sbc.q200.part3.to110

/*
    익명 함수
 */

fun main() {
    // 람다식과 비슷한 형태의 익명함수
    // 람다식과는 다르게 return 을 할 수 있어 버그를 일으킬 확률이 낮다.
    val instantFunc:(Int)->Unit = fun(number:Int):Unit {
        println("Hello $number")
    }
    instantFunc(33)
    instantFunc.invoke(33)
}