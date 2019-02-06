package sbc.q200.part4.to160

/*
    비어 있는 CharSequence 인지 검사하기
 */

fun main()
{
    val emptyStr = ""
    val whiteSpaces = " "
    val nullStr:String? = null

    println(emptyStr.isEmpty()) // 빈 문자열인가 (즉, "" 와 같은가), true
    println(whiteSpaces.isEmpty())

    println(emptyStr.isBlank()) // 공백문자로만 되어있는가
    println(whiteSpaces.isBlank())

    println(nullStr.isNullOrEmpty()) // 빈문자열 또는 null
    println(nullStr.isNullOrBlank()) // 공백문자 또는 null
}