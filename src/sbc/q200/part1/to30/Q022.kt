package part1.to30
/*
    if-else 를 표현식으로 사용하기
 */
fun main(args : Array<String>) : Unit {

    val value : Int = if (10 > 5) { // 변수 생성과 동시에 값을 넣을때도 if-else 사용 가능
        println("10은 5보다 크다.")
        10
    } else {
        println("10은 5보다 크지 않다.")
        5 // 형 지정 안하고 if-else 문에 내용이 없으면 Unit 타입으로 지정됨
    }

    println(value)

}