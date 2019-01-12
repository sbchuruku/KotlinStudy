package q200.part2.to60

/*
    생성자와 프로퍼티 한번에 쓰기
 */

class Car(val name:String, val speed:Int = 0) // 클래스를 더 간편하게 만들 수 있다.

fun main(args: Array<String>) {
    val car = Car("My Car")
    println(car.name)
    println(car.speed)
}