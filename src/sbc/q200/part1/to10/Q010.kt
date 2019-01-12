package part1.to10
/*
    문자 타입
 */
fun main(args: Array<String>) : Unit
{
    var ch : Char = 'A'
    println(ch)

    ch = '\uAC00' // 유니코드를 16진수 AC00 으로 표현한 값이 변수에 지정된다
    println(ch)

    ch = '한'
    println(ch.toInt()) // toInt() 를 하면 해당 문자의 유니코드 값을 보여준다.
}