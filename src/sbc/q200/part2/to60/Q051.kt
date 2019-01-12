package part2.to60
/*
    === , !== 연산자
 */
fun main(args: Array<String>) {
    var a = "one"
    var b = "one"

    println(a === b) // 객체를 비교할 때 쓰는 연산자

    b = "on"
    b += "e" // 이렇게 만들어도 실제론 메모리상에 on 문자열과 e 문자열이 존재함
    println(a!==b)

    b = a
    println(a===b)
}