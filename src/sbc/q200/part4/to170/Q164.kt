package sbc.q200.part4.to170

/*
   also 함수 : 객체 생성 및 초기화 코드를 표현식 하나로 압축하기
 */

class Person164
{
    var name:String = ""
    var age:Int = 0
    var money:Int = 0

    override fun toString() = "$name $age $money"
}

fun main()
{
    println(
        Person164().also {
            person:Person164 -> // this 를 person 매개변수에 담는것이 apply 와 다른점
            person.name = "Alan"
            person.money = 70
        }
    )
}