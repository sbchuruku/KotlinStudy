package sbc.q200.part4.to160

/*
    문자열 찾아 바꾸기
 */

fun main()
{
    val adage = "Love begets love."

    // oldValue 를 newValue 로 교체. ignoreCase 는 대/소 무시
    println(adage.replace("love","hate",ignoreCase = true))
    // oldValue 와 일치하는 첫번째 문자열을 newValue 로 교체
    println(adage.replaceFirst("love","compliment",ignoreCase = true))
    // 지정한 범위의 문자열을 변경
    println(adage.replaceRange(5..10,"hello"))
}