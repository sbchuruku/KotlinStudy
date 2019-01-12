package part2.to50
/*
    클래스
 */
class Person {
    var name:String = ""
    var age:Int = 0
}

fun main(args: Array<String>) {

    val person = Person() // 초기화. 코틀린에서 new 키워드는 삭제됨. 이 변수의 타입은 Person 이 됨
    // 클래스에서 위처럼 초기화 된 객체를 인스턴스 라고 부름
    person.name = "홍길동" // 초기화를 하지 않은 상태에서 변수에 접근하면 오류발생
    person.age = 36

    val person2 = Person()
    person.name = "김미영"
    person.age = 29

    val person3 = Person()
    person.name = "John"
    person.age = 52

}