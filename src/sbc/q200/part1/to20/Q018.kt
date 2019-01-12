package part1.to20
/*
    논리연산자
 */
fun main(args : Array<String>) : Unit
{
    val a = 15
    val b = 17

    var bool : Boolean = (a - b < a + b) && (a == 15) // 둘다 true 면 true 하나라도 false 면 false
    println(bool)

    bool = !((a + b) > (a * 3) || (b - a) > 0) // 둘중 하나라도 true 면 true 둘다 false 면 false
    println(bool)                              // ! 는 반전
}