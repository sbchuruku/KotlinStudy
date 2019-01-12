package part1.to40
/*
    지역변수와 다른 함수의 지역변수가 중복될 때
 */
fun main(args: Array<String>) {
    val a = 52
    println(a)

    printA() // 아무 문제없이 해당 함수의 지역변수가 호출됨
    printA2()
}

fun printA() {
    val a = 17
    println(a)
}

fun printA2() {
    val a = 120
    println(a)
}