package sbc.q200.part3.to110
/*
    객체 분해하기
 */
data class Employee102(val name:String, val age:Int, val salary:Int)

fun main() {
    // Empoyee 객체의 특정부분만 변수로 추출할때 사용. 언더스코어(_) 를 지정하여 무시할 수 있다.
    val(name, _, salary) = Employee102("John",30,3300)
    println(name);println(salary)
}