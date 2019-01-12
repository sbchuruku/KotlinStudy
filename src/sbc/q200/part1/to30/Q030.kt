package part1.to30
/*
    함수
 */
fun main(args : Array<String>) : Unit {

    println(myFunction())

}

fun myFunction() : Int { // 식별자() : 반환타입

    val a = 3
    val b = 6

    println("a:$a , b:$b")

    return a + b

}