package part1.to40
/*
    지역변수와 전역변수
 */
var count = 0 // 전역변수 어디서든 사용 가능

fun main(args: Array<String>) {

    val a  = 15 // 지역변수 블록 안에서만 사용 가능

    println(a)

    count += 1
    printCount()
    println(count)

}

fun printCount() {
    println(count)
    count += 1
}