package sbc.q200.part2.to70

/*
    Any 클래스
    어떤 클래스가 아무 클래스도 상속받지 않으면 기본적으로 Any 클래스를 자동으로 상속한다.
    다른 클래스를 상속한다고 하더라도 간접적으로 Any 클래스를 상속하므로 모든 클래스는 Any 클래스를 상속한다.
 */

class Building(val name:String = "", val date:String="", val area:Int=0) {
    // Any 클래스의 toString 멤버함수를 오버라이딩
    override fun toString(): String =
            "이름 : ${this.name}\n" +
                    "건축일자 : ${this.date}\n" +
                    "면적 : ${this.area} ㎡"
}

fun main(args: Array<String>) {

    val building = Building("코틀린",area = 100)
    printObject(building)

}

fun printObject(any:Any) {
    // Any 타입의 toString 을 호출하지만 다형성 때문에 Building 의 toString 호출
    println(any.toString())
}