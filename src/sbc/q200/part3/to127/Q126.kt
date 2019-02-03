package sbc.q200.part3.to127

import kotlin.reflect.KProperty

/*
    위임된 프로퍼티
 */

class Sample
{
    var number:Int by OnlyPositive()
}

class OnlyPositive
{
    private var realValue:Int = 0

    // 대리하는 객체의 필수 멤버함수
    operator fun getValue(thisRef:Any?,property:KProperty<*>):Int
    {
        return realValue
    }

    // 대리하는 객체의 필수 멤버함수
    operator fun setValue(thisRef:Any?,property: KProperty<*>,value:Int) // value 는 대리할 프로퍼티(realValue) 타입
    {
        realValue = if (value > 0) value else 0
    }
}

fun main() {
    val sample = Sample()

    sample.number = -50 // 음수가 들어오면 OnlyPositive 의 setValue 실행
    println(sample.number)

    sample.number = 100
    println(sample.number)
}


