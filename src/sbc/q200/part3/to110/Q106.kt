package sbc.q200.part3.to110
/*
    함수 참조
 */
fun plus(a:Int,b:Int) = println("plus 호출됨 ${a+b}")

object Object {
    fun minus(a:Int,b:Int) = println("Object의 minus 호출됨 ${a-b}")
}

class Class {
    fun average(a:Int, b:Int) = println("Class average 호출됨 ${(a+b)/2}")
}

fun main() {
    var instantFunc:(Int,Int)->Unit
    instantFunc = ::plus // ::를 앞에 붙이면 그 함수의 시그니처에 맞는 함수 타입이 된다.
    instantFunc(60,27)

    instantFunc = Object::minus // 객체의 맴버함수 호출
    instantFunc(36,12)

    instantFunc = Class()::average // 클래스의 인스턴스 멤버함수를 넣기 위해 생성 후 :: 를 붙여준다.
    instantFunc(25,15)
}