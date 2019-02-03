package sbc.q200.part3.to120

/*
    구체화된 타입 매개변수
 */
// 타입 매개변수 앖에 reified 를 붙여주면 is 연산자 사용가능. reified 를 사용하려면 inline 으로 선언해야함.
inline fun <reified T> check() {
    val number = 0
    if (number is T)
        println("T 는 Int 타입 입니다.")
}

fun main() {
    check<Int>()
}