package sbc.q200.part4.to160

/*
    CharSequence 쪼개기
 */

fun main()
{
    val hello:CharSequence = "안녕하세요.\n고맙습니다.\n반갑습니다."
    val time:CharSequence = "2018-01-22"

    println(hello.lines()) // lines 는 개행문자 \n을 기준으로 CharSequence 를 쪼개 List<String> 타입으로 반환
    for (line in hello.lineSequence()) // lineSequence 는 개행문자를 기준으로 Sequence<String> 타입으로 반환
        println(line)

    println(time.split('-')) // delimiters 문자로 문자열을 쪼갬
}