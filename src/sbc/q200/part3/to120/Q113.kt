package sbc.q200.part3.to120

/*
    클래스와 인터페이스에서 제네릭 사용하기
 */
// 클래스나 인터페이스에서 타입을 인수로 받으려면 선언시 이름 옆에 <식별자> 를 붙인다.
class Pair<A,B>(val first:A,val second:B) { // 매개변수 A 와 B 를 선언하여 두개의 타입지정
    override fun toString():String = "$first\n$second" // 모든 타입은 Any 클래스를 상속하므로 toString 멤버함수를 갖고 있다.
}

fun main() {
    val pair:Pair<Int, Double>
    pair = Pair<Int, Double>(15,9.12)
    println(pair)
}