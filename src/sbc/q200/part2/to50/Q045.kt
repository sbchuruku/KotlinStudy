package part2.to50
/*
    객체, 메모리 힙 영역
 */
fun main(args: Array<String>) {

    val person = object { // object 키워드로 객체 생성
        // 실제 메모리에는 아래에 프로퍼티(속성) 변수 값들의 위치값을 갖고 있다 이를 참조변수 라고 한다.
        // 그리고 이 위치값은 참조값 이라고 한다.
        val name:String = "홍길동"
        val age:Int = 36
    }

    println(person.name)
    println(person.age)

}