package part1.to40
/*
    메모리 스택 영역
 */
fun main(args: Array<String>) {
    val a = -36 // a
    val result = absolute(a) // a, number, result

    println(result)
}

fun absolute(number:Int):Int {
    return if (number >= 0)
        number
    else
        -number
}