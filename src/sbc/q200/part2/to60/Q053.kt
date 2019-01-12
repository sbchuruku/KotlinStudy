package part2.to60
/*
    프로퍼티와 멤버함수의 매개변수명이 중복될 때
 */
class AAA {
    var num = 15

    fun memberFunc(num:Int) {
        println(num) // 변수명을 쓸 경우 매개변수명으로
        println(this.num) // this 를 쓰면 프로퍼티명으로 활용
    }
}

fun main(args: Array<String>) {
    val a = AAA()
    a.memberFunc(53)
}