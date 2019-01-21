package sbc.q200.part2.to87

import sbc.q200.part2.to70.Person65
import sbc.q200.part2.to70.Student65

/*
    as 연산자와 다운캐스팅
 */

fun main(args: Array<String>) {
    val person:Person65 = Student65("John",32,20171218)
    val person2:Person65 = Person65("Jack",29)

    var person3:Student65 = person as Student65 // as 연산자로 좌측의 피연산자를 우측의 피연산자로 캐스팅
    person3 = person2 as Student65 // ClassCastException 예외 발생
}