package part1.to40
/*
    매개변수와 인수
 */
fun main(args: Array<String>) {
    println(cToF(30)) // 인수 : 함수를 호출할 때 사용되는 표현식
    println(getAverage(89,96))
}

fun cToF(celsius: Int) : Double { // 매개변수 : 함수를 호출한 곳으로 값을 전달받는것
    return celsius * 1.8 + 32
}

fun getAverage(a: Int, b: Int) : Double {
    return (a + b) / 2.0
}