package sbc.q200.part3.to127

/*
    클래스 위임
 */

interface Plusable127
{
    operator fun plus(other:Int):Int
}

class ClassDelegator:Plusable127
{
    override fun plus(other: Int): Int
    {
        println("기본 구현")
        return other
    }
}

class Sample127:Plusable127 by ClassDelegator() // 구현된 인터페이스 상속 뒤에 by 객체를 지정하면 위임

fun main()
{
    println(Sample127()+10) // Sample() + 10 을 수행하면 ClassDelegator 의 Plus 호출

}