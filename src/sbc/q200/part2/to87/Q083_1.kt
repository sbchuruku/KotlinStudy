package sbc.q200.part2.to87

/*
    접근 지정자:private
 */

private var num = 10

private fun print() = println(num)

public fun hello(value:Int) {
    num = value
    println(num)
}

public class Person83(age:Int) {

    public var age = age
        private set

    public val isYoung public get() = age < 30

}