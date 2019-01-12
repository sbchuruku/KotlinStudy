package part1.to20
/*
    if-else 문
 */
fun main(args : Array<String>) : Unit {
    val a = 10
    val b = 5

    if (a < b) // 조건
        println("if")
    else // if 조건에 만족하지 않으면
        println("else")

    if (a > b)
        println("a가 크다.")
    else
        println("b는 a 이상이다.")
}