package sbc.q200.part4.to160

fun main()
{
    val str = "   hello   "

    println(str.removeRange(0..5)) // 지정된 범위의 문자를 제거 후 반환

    println(str.padStart(20,'*')) // 앞에서 문자열의 길이를 lenght 만큼 늘린 뒤 padChar 로 채운 문자열 반환
    println(str.padEnd(17,'*')) // 위랑 같은데 뒤에서 늘림

    println(str.trimStart()) // 앞부분 문자열의 공백 제거
    println(str.trimEnd()) // 뒷부분 문자열의 공백 제거
    println(str.trim()) // 문자열의 앞,뒤 공백 제거

    println(str.slice(4..6)) // 지정 범위의 문자열을 잘라낸 뒤 반환
    println(str.subSequence(4..6))
    println(str.substring(4..6))
}