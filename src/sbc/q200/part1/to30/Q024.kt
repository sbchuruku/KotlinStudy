package part1.to30
/*
    when 문을 표현식으로
 */
fun main(args : Array<String>) : Unit {

    val score = 95

    val grade : Char = when (score / 10) { // 변수에 값을 바로 넣을때도 사용할 수 있다
        6 -> 'D'
        7 -> 'C'
        8 -> 'B'
        9,10 -> 'A'
        else -> 'F'
    }

    println(grade)

}