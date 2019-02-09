package sbc.q200.part5

/*
    코틀린에서 자바코드 접근하기 : Null 안전성
 */

class KotlinClass : Q191JavaInterface
{
    override fun trim(str: String?):String = str?.trim()?:""
}

fun main()
{
    val javaJavaInterface: Q191JavaInterface = KotlinClass()
    println(javaJavaInterface.trim("  hi  "))
}