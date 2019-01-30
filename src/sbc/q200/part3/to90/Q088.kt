package sbc.q200.part3.to90
/*
    객체 선언
 */
object Person { // object 키워드로 싱글턴패턴의 클래스를 생성
    var name:String = ""
    var age:Int = 0
    fun print() {
        println(name)
        println(age)
    }
}

fun main(args: Array<String>) {
    // 식별자 Person 으로 객체에 바로 접근 가능
    Person.name = "Singleton"
    Person.age = 45
    Person.print()
}