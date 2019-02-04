package sbc.q200.part4.to140

/*
    Comparable 인터페이스 : 클래스를 비교 가능하게 만들기
 */
// Comparable 인터페스를 상속하여 클래스간 비교할 수 있도록 함
class Rectangle131(val width:Int,val height:Int):Comparable<Rectangle131>
{
    val area = width * height

    override fun compareTo(other: Rectangle131): Int =
            when
            {
                this.area > other.area -> 1
                this.area < other.area -> -1
                else -> 0
            }
}

fun main()
{
    val rect = Rectangle131(3,5)
    val rect2 = Rectangle131(7,3)
    val rect3 = Rectangle131(2,9)

    println(rect >= rect3)
    println(rect < rect2)
    println(rect2 > rect3)
}