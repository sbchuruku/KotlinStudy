package sbc.q200.part3.to127

/*
    배열을 가변 인수로 활용하기
 */

fun printAll(vararg tokens:String)
{
    for (token in tokens)
        print("$token ")
}

fun main() {
    val numbers:Array<String> = arrayOf("Whats","your","name?")
    printAll(*numbers) // 배열 앞에 * 을 찍으면 배열속의 내용을 가변 인수로 활용 가능
}