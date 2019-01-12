package part1.to30
/*
    중첩 if 문
*/
fun main(args : Array<String>) : Unit {

    val score = 88

    if (score >= 90) {
        println('A')
    } else {
        if (score >= 80) {
            println('B')
        } else {
            if (score >= 70) { // else if 를 활용하면 더 깔끔하게 바꿀 수 있다.
                println('C')
            } else {
                println('F')
            }
        }
    }

}

