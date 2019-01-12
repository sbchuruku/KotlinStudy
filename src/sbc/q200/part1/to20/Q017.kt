package part1.to20

/*
    비교연산자
 */
fun main(args : Array<String>) : Unit
{
    var isRight : Boolean = (10 + 70) > (3 * 25)
    println(isRight)

    isRight = false
    println(isRight)

    isRight = 30 == (10 + 20) // 리터럴 비교는 부등호 두개지만 객체 비교는 세개 즉 === 또는 !== 으로
    println(isRight)          // 비교해야된다.

    isRight = 0.00001f == 0.005f * 0.002f
    println(isRight)

    isRight = 3.0 * 5 + 2.7 <= 16
    println(isRight)
}