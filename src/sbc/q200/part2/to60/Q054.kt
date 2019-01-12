package q200.part2.to60
/*
    생성자와 초기화
 */
class Person constructor(name:String,age:Int) { // constructor 키워드를 사용하지 않아도 됨
    val name:String                             // 코틀린에선 생성자 정의를 클래스 이름에 합쳐버림
    val age:Int

    init { // 프로퍼티를 매개변수의 값으로 초기화 init 을 사용하면 선언과 동시에 초기화를 하지 않아도 된다.
        this.name = name
        this.age = age
    }
}

fun main(args: Array<String>) {
    val person = Person("홍길동",46)
    println("이름:${person.name}")
    println("나이:${person.age}")
}