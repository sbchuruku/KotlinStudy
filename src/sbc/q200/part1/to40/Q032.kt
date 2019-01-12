package part1.to40
/*
    Unit 타입
 */
fun main(args: Array<String>) {

    celsiusToFah(27)

}

fun celsiusToFah(celsius: Int) : Unit { // 함수의 리턴타입을 Unit 으로 할 경우 retun 을 하지 않아도 된다
    println(celsius * 1.8 + 32)
}