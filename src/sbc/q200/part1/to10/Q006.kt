package part1.to10
/*
    증감연산자
 */
fun main(args: Array<String>) : Unit
{
    var a = 10
    var b = 10

    println(a++ +b) // 후행 연산으로 a+b 출력 이후 a에 +1 을 수행
    println(a)
    println(--b)
}