package part1.to10
/*
    비트연산
 */
fun main(args: Array<String>) : Unit
{
    println(15 and 7)
    println(15 or 2)
    println(15 xor 5)
    println(23767.inv()) // 반전
    println(1 shl 3) // 왼쪽으로 3
    println(8 shl 1) // 오른쪽으로 1
    println(-17 ushr 2) // 부호 유지한채 오른쪽으로 2
}