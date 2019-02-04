package sbc.q200.part4.to130

/*
    Triple 클래스 : 세 변수를 하나로 묶기
 */

// 원의 지름, 원주, 넓이를 반환한다.
fun calculateCircle(radius:Int):Triple<Int,Double,Double> = // Triple 클래스로 원하는 결과를 묶어서 반환
    Triple(radius * 2, radius * 2 * 3.14, 3.14 * radius * radius)

fun main()
{
    val (diameter,_,area) = calculateCircle(5) // 사용하지 않는 값은 _ 로 무시
    println("지름:$diameter")
    println("넓이:$area")
}