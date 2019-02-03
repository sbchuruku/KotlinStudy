package sbc.q200.part3.to120

/*
    in/out 키워드
 */

class AAA<out T> // AAA<서브타입> 을 AAA<슈퍼타입> 에 대입 가능. 자바에서 extends T 와 같다.

class BBB<in T> // BBB<슈퍼타입> 을 BBB<서브타입> 에 대입 가능. 자바에서 super T 와 같다.

fun main()
{
    val aaaSub = AAA<Int>()
    val aaaSuper:AAA<Any> = aaaSub

    val bbbSuper = BBB<Any>()
    val bbbSub:BBB<Int> = bbbSuper

    val star:AAA<*> = aaaSub // 타입 인수로 * 을 지정하면 타입 인수와 상관없이 AAA 타입을 대입할 수 있다.
}