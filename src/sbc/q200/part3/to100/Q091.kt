package sbc.q200.part3.to100

/*
    const
 */

const val hello = "Hello" + " World!" // 리터럴로 이루어진 표현식만 저장 가능

object Foo {
    const val bar = "bar"
}

fun main(args: Array<String>) {
    println(hello)
    println(Foo.bar)
    println(hello)
    println(Foo.bar)
}