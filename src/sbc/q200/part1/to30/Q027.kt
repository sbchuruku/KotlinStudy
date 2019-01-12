package part1.to30
/*
    흐름제어 continue
 */
fun main(args : Array<String>) : Unit {

    var i = 0

    while (i < 10) {
        i += 1
        if (i % 2 == 0) // 나눈 나머지가 0이면 즉, 짝수이면
            continue // continue 아래의 문장들을 skip 한다
        println(i)
    }

}