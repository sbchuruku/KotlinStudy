package sbc.q200.part3.to110

/*
    데이터 클래스
 */

// data 키워드로 데이터클래스 정의
/*
    데이터클래스는
    - Any 클래스에 들어있는 equals,hashCode,toString 멤버함수가 자동으로 오버라이딩
    - 적어도 하나의 프로퍼티를 가져야 한다.

 */
data class Employee101(val name:String, val age:Int, val salary:Int)

fun main() {
    val first = Employee101("John",30,3000)
    val second = Employee101("Page", 24, 5300)
    val third = first.copy()

    println(first.toString())
    println(third.toString())
    println(first == second) // equals 멤버함수는 각 프로퍼티의 값이 모두 같으면 true, 하나라도 다르면 false
    println(first == third)
}