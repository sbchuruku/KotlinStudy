package part1.to40
/*
    가변인수
 */
fun main(args: Array<String>) {

    println(getSumOf(1,2,3,4,5,6,7))
    println(getSumOf(32,57,12))
    println(getSumOf())

}

fun getSumOf(vararg numbers: Int) : Int {
// vararg 로 여러개의 인수를 Int 형 배열 파라미터로 가져옴

    val count = numbers.size // numbers 배열 파라미터의 크기
    var i = 0
    var sum = 0

    while (i < count) {
        sum += numbers[i] // numbers 배열 파라미터의 i 번째 값을 꺼내서 sum 에 더함
        i += 1
    }

    return sum

}