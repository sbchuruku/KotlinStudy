package sbc.q200.part2.to87

/*
    접근 지정자: protected
 */

open class AAA84(protected val number:Int)

class BBB(number:Int):AAA84(number) {
    fun printNumber() {
        // AAA 클래스(슈퍼클래스)의 number 프로퍼티에 접근가능
        println(number)
    }
}

fun main(args: Array<String>) {
    val test = BBB(36)
//    println(test.number) // number 프로퍼티는 protected 로 되어 있기 때문에 클래스 외부에서 접근 불가
    test.printNumber()
}