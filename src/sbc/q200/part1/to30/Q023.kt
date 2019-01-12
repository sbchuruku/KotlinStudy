package part1.to30
/*
    조건문 when
 */
fun main(args: Array<String>) : Unit {

    val score = 64

    when (score / 10) { // 조건
        6 -> { println('D') } // 조건의 값에 따라 실행
        7 -> { println('C') }
        8 -> { println('B') }
        9,10 -> { println('A') }
        else -> { println('F') } // 위의 값들이 전부 없을 경우
    }

    println("test")

}