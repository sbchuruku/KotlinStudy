package part2.to50
/*
    문자열간 + 연산 시 주의점
 */
fun main(args: Array<String>) {
    var first = "Hello "
    var second = "World"
    first += second // 문자열 + 연산시 기존에 갖고 있던 "Hello " 는 메모리에 남긴채
    println(first)  // first 변수에 "Hello World"가 생성된다.
}