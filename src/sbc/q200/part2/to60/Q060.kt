package q200.part2.to60

/*
    번호 붙은 접근 연산자
 */

class Person60(var name:String, var birthday:String) {

    /*
        클래스[position] 에 따라 프로퍼티 값을 저장하도록 getter/setter 를 만들어줌
     */

    operator fun get(position:Int):String {
        return when(position) {
            0 -> name
            1 -> birthday
            else -> "알 수 없음"
        }
    }

    operator fun set(position:Int, value:String) {
        when(position) {
            0 -> name = value
            1 -> birthday = value
        }
    }

}

fun main(args: Array<String>) {
    val person = Person60("Kotlin", "2019-01-10")
    println(person[0])
    println(person[1])
    println(person[-1])

    person[0] = "Java" // person.set(0,"Java")
    println(person.name)

    person.name = "Android"
    println(person[0]) // println(person.name)
}
