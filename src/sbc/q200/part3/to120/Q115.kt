package sbc.q200.part3.to120

/*
    특정 타입을 상속/구현하는 타입만 인수로 받기
 */

interface ValueContainer
{
    fun getValue():Int
}

class AAA115:ValueContainer // ValueContainer 구현 클래스
{
    override fun getValue(): Int = 1102
}

class BBB115:ValueContainer // ValueContainer 구현 클래스
{
    override fun getValue(): Int = 127
}

fun <T:ValueContainer> T.printValue() // ValueContainer 타입 인수하는 확장함수
{
    println(this.getValue())
}

fun main()
{
    AAA115().printValue()
    BBB115().printValue()
}