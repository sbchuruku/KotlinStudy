package sbc.q200.part3.to110
/*
    클로저
 */
fun returnFunc(num:Int):()->Unit = { println(num) }

fun main() {
    val f:()->Unit = returnFunc(30)
    f() // 함수 리터럴은 자신이 만들어질 때의 상황을 기억하고 있기 때문에 num 변수의 값을 복사해서 갖고 있는다.
        // 함수가 만들어질 때 주변상황을 기억하는 함수를 클로저라고 한다.
}