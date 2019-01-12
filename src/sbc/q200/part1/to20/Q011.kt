package part1.to20
/*
    문자열
 */
fun main(args : Array<String>) : Unit
{
    var str : String = "Hello"
    println(str)

    str = str + "\nKotlin!"
    println(str) // 개행문자 \n 을 한개 문자로 인식 출력 할땐 개행

    println(str[8]) // 문자를 배열로 인식 하여 8번째 (0부터 시작) 값을 출력

    val num = 10 * 5 + 3
    println(str + num)
}