package sbc.q200.part2.to87

/*
    접근지정자
 */

class Rectangle(private val width:Int, private val height:Int) {
    val area:Int
        get() = width * height
}

fun main(args: Array<String>) {

    val rect = Rectangle(5,7)
//    println(rect.width) // private 로 지정되어 있어서 Rectangle 클래스 내부에서만 접근 가능능

   println(rect.area)

}