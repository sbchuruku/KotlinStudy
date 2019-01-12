package programmers.lv1

fun main(args: Array<String>) {
    val (a, b) = readLine()!!.split(' ').map(String::toInt)

    printSquare(a, b)
}

fun printSquare(n:Int, m:Int) {
//    for (i in 1..m) {
//        for (i in 1..n) {
//            print("*")
//        }
//        println()
//    }
    var width = n
    var height = m

    while (height > 0) {
        while (width > 0) {
            print("*")
            width -= 1
        }
        println()
        height -= 1
        width = n
    }
}