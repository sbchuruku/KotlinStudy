package sbc.q200.part2.to80

import sbc.q200.part2.to70.Person65
import sbc.q200.part2.to70.Student65

/*
    is 연산자
 */

class Professor(name:String, age:Int):Person65(name, age)

fun main(args: Array<String>) {
    val person:Person65 = Student65("Mark Zuckerberg",33,20171225)
    print("${person is Person65} ") // is : 자바의 intanceof 랑 같은 기능
    print("${person is Student65} ")
    print("${person is Professor} ")

    val person2:Person65 = Professor("Kim",48)
    print("${person2 is Person65} ")
    print("${person2 is Student65} ")
    print("${person2 !is Professor} ")
}