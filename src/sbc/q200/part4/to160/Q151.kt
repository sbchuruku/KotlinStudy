package sbc.q200.part4.to160

/*
    접두사/접미사 관련 CharSequence 확장 함수
 */

fun main()
{
    val str:CharSequence = "https://www.naver.com"

    println(str.startsWith("https://")) // 시작하는 문자 체크
    println(str.endsWith(".com")) // 끝나는 문자 체크

    println(str.removePrefix("https://")) // 시작지점 부터 해당 문자열 삭제
    println(str.removeSuffix(".com")) // 해당 문자열로 끝나는 부분 삭제
    println(str.removeSurrounding("https://",".com")) // prefix 와 suffix 를 제외하고 반환
}