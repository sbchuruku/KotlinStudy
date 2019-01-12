package part1.to10
/*
    실수 타입의 함정
 */
fun main(args: Array<String>) : Unit
{
    println(0.1f + 0.1f + 0.1f)
    println(0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f)
    // 실수값은 2진수 유효숫자로 표현되기 때문에 상황에 따라 정확한 값이 안나올때도 있다.
    println(0.1f * 10)
}