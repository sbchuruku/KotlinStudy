package part1.to40

var a = 5

fun main(args: Array<String>) {
    val a = 30 // 전역변수와 지역변수 이름이 같다면 지역변수로 활용(가까운 스코프)

    println(a)

    func()
}

fun func() {
    println(a)
}