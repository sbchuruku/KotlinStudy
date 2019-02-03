package sbc.q200.part3.to127

/*
    열거 클래스에 프로퍼티와 멤버 함수 선언하기
 */

enum class Mode123(val number:Int)
{
    SELECTION(0),
    PEN(1),
    SHAPE(2),
    ERASER(3); // 열거 상수 끝은 세미콜론(;)을 반드시 붙여야 한다.

    fun printNumber() // 열거 클래스의 프로퍼티나 멤버함수는 반드시 열거 상수 나열문보다 뒤에 와야함
    {
        println("모드:$number")
    }
}

fun main() {
    // 현재 선택된 모드
    val mode:Mode123 = Mode123.ERASER

    println(mode.number)
    mode.printNumber()
}