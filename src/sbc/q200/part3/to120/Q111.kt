package sbc.q200.part3.to120
/*
    여러 타입을 인수로 받기
 */
fun <T,R> T.map(mapper:(T)->R):R // T 와 R 을 선언하여 T 타입을 R 타입으로 변환하는 함수
{
    return mapper(this)
}

fun main() {
    val square:Int =
            11.map {
                it * it // it 에 11이 들어오게 되고 11의 제곱값이 Int 타입이므로 T와 R 에 각각 Int 타입이 들어감
            }
    println(square)
}