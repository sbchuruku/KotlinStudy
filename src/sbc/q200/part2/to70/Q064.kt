package sbc.q200.part2.to70

/*
    상속
 */

//슈퍼클래스 기본적으로 클래스 상속이 막혀있다. open 키워드를 쓰면 허용.
open class Person64(val name:String, val age:Int)

// 상속클래스
class Student64(name:String, age:Int, val id:Int):Person64(name, age)

fun main(args: Array<String>) {
    val persion = Person64("홍길동",35)
    val student = Student64("김길동",23,20171217)
}