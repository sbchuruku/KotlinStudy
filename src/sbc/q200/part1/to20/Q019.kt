package part1.to20
/*
    if 문
 */
fun main(args : Array<String>) : Unit {
    var a = 15
    val b = 11

    if (a > b) { // 조건
        println("if 안으로 들어옴") //
        a -= b                    // 조건문
    }

    println(a)
}