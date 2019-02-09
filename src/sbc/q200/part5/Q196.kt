package sbc.q200.part5

import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass

/*
    코틀린에서 자바 코드 접근하기 : 클래스 참조
 */
fun main()
{
    val number:Int = 26
    val str:String = "2018년"

    Q196JavaClass.printClassInfo(number::class.java) // ::class.java 를 적으면 자바에서 호환되는 Class<T> 타입의 객체를 가져온다.
    Q196JavaClass.printClassInfo(str::class.java)
    Q196JavaClass.printClassInfo(Double::class.java)
}