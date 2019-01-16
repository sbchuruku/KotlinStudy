package sbc.q200.part2.to80

import part2.to60.Building

/*
    안전한 호출 연산자
 */

fun main(args: Array<String>) {

    var obj:Building? = null
    obj?.print() // null 이므로 print() 호출은 무시. 값은 null 타입은 Unit?이 된다.
    obj?.name = "건물" // null 이므로 setter 도 무시

    obj = Building()
    obj?.name = "서울월드컵경기장" // null 이 아니므로 setter 동작
    obj?.date = "2001년 11월 10일"
    obj?.area = 21_6712
    obj?.print() // null 이 아니므로 print() 동작

}