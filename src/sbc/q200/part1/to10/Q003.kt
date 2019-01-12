package part1.to10
/*
    변수 선언과 사용
    var 는 일반변수 val 은 final 변수
 */
fun main(args: Array<String>) : Unit
{
    var total:Int
    total = 0

    val a: Int = 10 + 53 - 7
    println(a)

    val b: Int = 43 + 75 + a
    println(b)

    total = a + b
    println(total)
}