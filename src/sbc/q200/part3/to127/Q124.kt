package sbc.q200.part3.to127

/*
    열거 클래스 활용하기
 */

enum class Mode124
{
    SELECTION, PEN, SHAPE, ERASER
}

fun main() {
    val shapeMode:Mode124 = Mode124.SHAPE
    println(shapeMode.name) // 열거 상수의 이름
    println(shapeMode.ordinal) // 열거 상수의 순서. 0 부터 시작

    val modes:Array<Mode124> = Mode124.values() // values() 함수는 열거 클래스의 모든 열거상수를 배열로 반환
    for (mode:Mode124 in modes)
        println(mode)

    println(Mode124.valueOf("PEN").ordinal)
}