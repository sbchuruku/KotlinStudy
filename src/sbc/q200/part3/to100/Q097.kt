package sbc.q200.part3.to100

/*
    인터페이스
 */

interface Printable { // 인터페이스는 멤버 함수, 추상 멤버 함수, 추상 프로퍼티 를 가질 수 있다. 일반 프로퍼티와 생성자는 가질 수 없다.
    fun print():Unit // 인터페이스의 멤버 함수는 내용이 비어있으면 자동으로 abstract 가 된다.
}

class AAA97:Printable {
    override fun print() {
        print("Hello")
    }
}

fun print(anything:Printable) {
    anything.print()
}

fun main(args: Array<String>) {
    print(AAA97())
}

