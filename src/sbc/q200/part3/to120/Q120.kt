package sbc.q200.part3.to120

/*
    배열
 */

fun main() {
    val integers:Array<Int> = arrayOf(10,20,30,40)

    println(integers.size) // 배열의 크기
    println(integers[1]) // get/set 을 [] 로 접근 가능. 1번째 원소 호출

    for (i in integers)
        print("$i ")
}