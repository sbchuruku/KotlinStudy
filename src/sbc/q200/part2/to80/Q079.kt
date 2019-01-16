package sbc.q200.part2.to80

/*
    스마트 캐스팅
 */

fun main(args: Array<String>) {

    val number:Int? = null
    val number2 = 1225

    checkNull(number)
    checkNull(number2)

}

fun checkNull(any:Any?) {

    if (any == null) {
        println("null이 들어왔습니다.")
        return
    }

    println(any.toString()) // null 이 아님이 확정되었을 때 (Not-null 타입) 스마트 캐스팅

}