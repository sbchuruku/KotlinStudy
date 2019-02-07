package sbc.q200.part4.to160

/*
    Regex 클래스 : 정규식 다루기
 */

fun main()
{
    val regex = Regex("[0-9]+") // 숫자로만 이루어져 있는 정규식
    val str = "4324235"
    val str2 = "324 6546 5432"

    println(regex matches str) // str 이 숫자로만 되어있는지
    println(regex matches str2) // str2 가 숫자로만 되어있는지
    println(regex.replace(str2, "숫자")) // str2의 숫자 부분 "숫자" 로 치환
}