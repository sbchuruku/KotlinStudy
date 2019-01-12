package part2.to60
/*
    멤버함수
 */
class Building {
    var name = ""   // 건물명
    var date = ""   // 건축일자
    var area = 0    // 면적(m2)

    fun print() { // 멤버함수 : 클래스 안에 내장된 함수
        println("이름 : $name")
        println("건축일자 : $date")
        println("면적 : $area ㎡")
    }
}

fun main(args: Array<String>) {
    val building = Building()
    building.name = "A 오피스텔"
    building.date = "2017-12-13"
    building.area = 120 * 8

    building.print() // 멤버함수 호출
}