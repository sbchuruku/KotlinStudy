package sbc.q200.part2.to80

import part2.to60.Building

/*
    Not-null  단정 연산자
 */

fun main(args: Array<String>) {

    var obj:Building? = Building()
    obj!!.name = "서울시청" // obj 가 null 아 아니기 때문에 setter 정상 동작
    println(obj!!.name)

    obj = null
    obj!!.print() // obj 가 null 이기 때문에 예외 발생

}