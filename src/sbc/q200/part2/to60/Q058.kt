package q200.part2.to60

/*
    프로퍼티와 Getter/Setter
 */

class Person58 {
    // 기본적으로 getter/setter 는 자동 정의 되어있으나 커스터마이징을 해야 할 때 아래와 같이 정의하고 사용
    var age:Int = 0
    get() { // age 의 getter
        return field
    }
    set(value) { // age 의 setter
        field = if(value >= 0) value else 0
    }

}

fun main(args: Array<String>) {
    val person = Person58()
    person.age = -30 // setter 를 호출
    println(person.age)
}