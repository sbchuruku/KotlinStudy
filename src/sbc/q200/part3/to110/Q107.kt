package sbc.q200.part3.to110

/*
    고차 함수 : 인수로 함수를 받거나 함수를 반환하는 함수
 */
fun decorate(task:()->Unit) {
    println("=== 작업 시작 ===")
    task()
    println("=== 작업 끝 ===")
}

fun main() {
    // 어떤 함수를 호출하기 전/후에 수행해야 할 고정적인 작업이 있는 경우 활용
    decorate({
        val a = 10; val b = 5
        println("$a + $b = ${a+b}")
    })

    decorate ({
        println("some"); println("taskse")
    })
}