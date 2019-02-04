package sbc.q200.part4.to130

/*
    Pair 클래스 : 두 변수를 하나로 묶기
 */

// 두 수의 몫과 나머지를 반환한다.
fun divide(a:Int,b:Int):Pair<Int,Int> = Pair(a/b,a%b)

fun main()
{
    val(q,r) = divide(10,3) // Pair 객체로 묶여서 반환되므로 여러개의 변수로 받을 수 있다.
    println("몫:$q")
    println("나머지:$r")
}