package part1.to40
/*
    디폴트 인수
 */
fun main(args: Array<String>) {
    println(getAverage(80,90)) // 인수를 넣지 않아도 초기화된 값으로 함수 호출
    getAverage(100,50,true)
    println(getAverage(90))
    getAverage(66,print = true)
    getAverage(print = true)
    getAverage(print = true, a = 10, b = 30) // 매개변수 순서를 다르게 호출 가능
}

fun getAverage(a: Int = 0, b: Int = 0, print:Boolean = false) : Double {
    // 매개변수에 값을 초기화

    val result = (a + b) / 2.0

    if (print)
        println(result)

    return result

}