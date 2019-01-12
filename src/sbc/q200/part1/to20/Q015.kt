package part1.to20
/*
    배정연산자
 */
fun main(args : Array<String>) : Unit
{
    val a : Int
    var b : Int

    a = 10 + 5
    b = 10

    b += a // b 에 a 값을 더함
    print(b)

    b %= 3 // b 를 3으로 나눈 나머지를 b에 저장
    println(b)
}