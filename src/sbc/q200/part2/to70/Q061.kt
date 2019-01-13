package sbc.q200.part2.to70

/*
    호출 연산자
 */

class Product(val id:Int, val name:String) {

    operator fun invoke(value:Int) { // ()연산자를 오버로딩하는 멤버함수 invoke. 매개변수는 몇개든 상관없다.
        println(value)
        println("id: $id\nname: $name")
    }

}

fun main(args: Array<String>) {
    val product = Product(762443,"코틀린200제")
    product(108) // invoke 가 생략되어도 호출
}