package sbc.q200.part4.to160

/*
    StringBuilder 클래스 : 문자열 덧붙이기
 */

fun main() {
    val builder:StringBuilder = StringBuilder()
        .append("2018 ") // append 멤버 함수는 StringBuilder 자기 자신을 반환하기 때문에 연쇄적 호출 가능
        .append("Pyeongchang ")
        .append("Olympic")

    val result = builder.toString() // StringBuilder 의 toString 멤버함수를 호출하면 최종 문자열
    println(result)
}