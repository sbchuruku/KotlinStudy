package part1.to40
/*
    지역함수
 */
fun main(args: Array<String>) {

    fun printFomular(a:Int, b:Int) { // 지역함수 : 특정 지역에서만 사용되어지는 함수
        println(a * b + a - b)
    }

    printFomular(73,1)
    printFomular(4, 6)
}