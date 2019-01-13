package sbc.q200.part2.to70

/*
    오버라이딩
 */

open class AAA {
    open fun func() = println("AAA") // 오버라이딩을 허용하기위해 open 키워드 사용
}

class BBB : AAA() {
    // 서브클래스에서 슈퍼클래스의 멤버함수의 동작을 덮어쓰기위해 override 키워드 사용
    // 더 이상의 오버라이드를 허용하지 않으려면 앞에 final 키워드 사용
    override fun func() {
        super.func() // this 는 자기자신 super 는 슈퍼클래스를 의미
        println("BBB")
    }
}

fun main(args: Array<String>) {
    AAA().func()
    BBB().func()
}