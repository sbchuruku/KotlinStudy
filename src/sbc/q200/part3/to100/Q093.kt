package sbc.q200.part3.to100

/*
    Nullable 리시버
 */

fun String?.isNumber() { // 확장함수를 응용한 Nullable 리시버
    if (this == null)
        println("문자열이 null 입니다.")
}

fun main(args: Array<String>) {
    val empty:String? = null
    empty.isNumber() // 표현식의 Null 값이어도 확장함수 호출 가능
}