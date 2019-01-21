package sbc.q200.part2.to87

/*
    접근 지정자:private
 */

fun main(args: Array<String>) {
    // Q083_1 의 가진 변수, 메서드에 private 은 오류, public 은 접근가능
//    num = 5
    hello(15)

    val person = Person83(10)
    println(person.age)
//    person.age = 20

    println(person.isYoung)
}