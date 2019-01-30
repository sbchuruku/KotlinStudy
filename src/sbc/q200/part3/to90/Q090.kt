package sbc.q200.part3.to90
/*
    inline 함수
 */
inline fun hello() { // 실행 흐름을 점프하지 않고 호출문을 함수의 몸체로 대체
    println("Hello")
    println("Kotlin")
}

fun main(args: Array<String>) {
    hello()
    hello()
    hello()
    /*
    즉 위의 함수는 컴파일시 아래로 대체된다.
    println("Hello")
    println("Kotlin")
    println("Hello")
    println("Kotlin")
    println("Hello")
    println("Kotlin")
     */
}