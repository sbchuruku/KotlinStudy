package sbc.q200.part3.to100

/*
    lateinit
 */

// 점을 표현하는 클래스
class Point(val x:Int, val y:Int)

// 사각형을 표현하는 클래스
class Rect {
    lateinit var pt:Point // lateinit 키워드는 클래스에서 바로 초기화 하지 않아도 된다. var 변수에만 가능
    lateinit var pt2:Point

    val width:Int get() = pt2.x - pt.x
    val height:Int get() = pt2.y - pt.y
    val area get() = width * height
}

fun main(args: Array<String>) {
    val rect = Rect()
    rect.pt = Point(3,3)
    rect.pt2 = Point(6,5)

    println("너비:${rect.width}")  // pt 와 pt2 의 프로퍼티에 값이 없는경우 UninitializedPropertyAccessException 예외 발생
    println("높이:${rect.height}")
    println("넓이:${rect.area}")
}