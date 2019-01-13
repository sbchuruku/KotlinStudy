package sbc.q200.part2.to70

/*
    멤버함수의 중위 표기법
 */

class Point(var x:Int = 0, var y:Int = 0) {

    // base 를 원점으로 생각했을 때의 좌표를 반환한다.
    infix fun from(base:Point):Point { // 중위 표기법의 키워드는 infix
        return Point(x - base.x, y - base.y)
    }

}

fun main(args: Array<String>) {
    val pt = Point(3,6) from Point(1,1) // 멤버함수를 중위 표기법으로 호출 Point(3,6).from(Point(1,1)) 과 같은 의미
    println(pt.x)
    println(pt.y)
}