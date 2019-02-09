package sbc.q200.part4.to170

/*
    apply 함수 : 객체 생성 및 초기화 코드를 표현식 하나로 압축하기
 */

class Person163
{
    var name:String = ""
    var age:Int = 0
    var money:Int = 0

    override fun toString() = "$name $age $money"
}

fun main()
{
    println(
        Person163().apply {
            this.name = "Alan" // this 에 생성된 인스턴스
            this.money = 70
        }
    )
}