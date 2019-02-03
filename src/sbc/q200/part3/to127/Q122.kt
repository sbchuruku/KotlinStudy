package sbc.q200.part3.to127

/*
    열거 클래스
 */

enum class Mode // 숫자로 변수를 저장하는 것보다 효율적으로 활용할 수 있다.
{
    SELECTION, PEN, SHAPE, ERASER // 열거클래스에 들어가는 식별자를 열거 상수라고 한다.
}

fun main()
{
    // 현재 선택된 모드
    val mode:Mode = Mode.PEN

    when (mode)
    {
        Mode.SELECTION -> println("선택 모드")
        Mode.PEN -> println("펜 모드")
        Mode.SHAPE -> println("도형 모드")
        Mode.ERASER -> println("지우개 모드")
    }
}