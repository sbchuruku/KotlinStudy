package q200.part2.to60

/*
    연산자 오버로딩
 */

class Point(var x:Int, var y:Int = 0) {

    /*
     operator 키워드를 사용하면 실제 연산자 (ex: +, -, *, /, >, < 등등..)를 예약된 함수명으로
     오버로딩이 가능하다. 이를 연산자 오버로딩이라 한다.
     오버로딩이 가능한 연산자와 예약된 함수명은 책 참조(p.168)
    */
    operator fun plus(other:Point):Point {
        return Point(x + other.x, y + other.y)
    }

    operator fun minus(other:Point):Point {
        return Point(x - other.x, y - other.y)
    }

    operator fun times(number:Int):Point {
        return Point(x * number, y * number)
    }

    operator fun div(number:Int):Point {
        return Point(x/number, y/number)
    }

    // x,y 값 출력
    fun print() {
        println("x: $x, y: $y")
    }
}

fun main(args: Array<String>) {
    val pt1 = Point(3, 7)
    val pt2 = Point(2,-6)

    val pt3 = pt1 + pt2
    val pt4 = pt3 * 6
    val pt5 = pt4 / 3

    pt3.print()
    pt4.print()
    pt5.print()
}