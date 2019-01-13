package sbc.q200.part2.to70

/*
    업캐스팅
 */

open class Person65(val name:String, val age:Int)

class Student65(name:String, age:Int, val id:Int):Person65(name, age)

fun main(args: Array<String>) {
    // 업캐스팅. 서브클래스로 생성하고 슈퍼클래스 변수에 넣어준다.
    // 서브클래스의 프로퍼티는 접근할 수 없다.(ex: person.id)
    // 슈퍼클래스 타입은 항상 슈퍼클래스 또는 서브클래스의 인스턴스만 가리킬 수 있다.
    val person:Person65 = Student65("John",32,20171218)
    // val student:Student65 = person 하면 오류


}