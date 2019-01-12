package q200.part2.to60

/*
    보조생성자
 */

class Time(val second:Int) { //클래스 이름 옆에 오는것을 주 생성자라고 하고 여기서는 키워드는 생략되고 매개변수만 받는다.
    init {
        println("init 블록 실행 중")
    }

    // 보조 생성자 1
    constructor(minute:Int, second:Int):this(minute * 60 + second) { // 여기서 this 는 이클래스에 포함된 다른 생성자를
        println("보조 생성자 1 실행 중")                                       // 호출한다. 매개변수가 한개이므로 주 생성자가 호출된다.
    }

    // 보조 생성자 2
    constructor(hour:Int, minute:Int, second:Int):this(hour * 60 + minute,second) {
        println("보조 생성자 2 실행 중") // 여기서는 매개변수가 두개이므로 보조 생성자 1이 호출된다.
    }

    init {
        println("또 다른 init 블록 실행 중")
    }
}

fun main(args: Array<String>) {
    println("${Time(15,6).second} 초") // 주생성자, 보조생성자1 을 타게됨
    println("${Time(6,3,17).second} 초") // 주생성자, 보조생성자1, 보조생성자2 를 타게됨
}