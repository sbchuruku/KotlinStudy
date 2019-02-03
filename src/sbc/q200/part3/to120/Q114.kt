package sbc.q200.part3.to120

/*
    제네릭이 적용된 클래스/인터페이스 상속,구현 하기
 */

interface Plusable<T>
{
    operator fun plus(other:T):T // T 타입과 덧셈을 가능하게 하는 인터페이스 선언
}

class Rectangle(val width:Int,val height:Int):Plusable<Rectangle> // Plusable 인터페이스 상속 Rectangle 타입 인수 전달
{
    // Rectangle 의 width 와 height 끼리 더한 값을 반환하도록 plus 를 오버라이딩
    override fun plus(other:Rectangle) = Rectangle(width+other.width,height+other.height)
    override fun toString() = "width:$width,height:$height"
}

fun main()
{
    val rect = Rectangle(10,5)
    val rect2 = Rectangle(3,8)

    println(rect+rect2)
}