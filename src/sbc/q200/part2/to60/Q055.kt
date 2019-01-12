package q200.part2.to60
/*
    init 블록 나눠서 쓰기
 */
class Size(width:Int,height:Int) {

    val width = width // 선언과 동시에 초기화 할 때도 생성자의 매개변수를 사용할 수 있다.
    val height:Int

    init {
        this.height = height
    }

    val area:Int

    init { // init 을 여러번 사용 할 수 있다.
        area = width * height
    }

}

fun main(args: Array<String>) {
    val size = Size(10,50)
    println(size.area)
}