package sbc.q200.part2.to87

/*
    접근 지정자 오버라이딩
 */

open class AAA85(protected open val number:Int) {
    protected open fun hello() {
        println("hello")
    }
}

class BBB85(number:Int):AAA85(number) {
    public override val number:Int // number 변수를 public 으로 변경
        get() = super.number

    public override fun hello() = super.hello() //
}

fun main(args: Array<String>) {
    val b = BBB85(26)
    val a:AAA85 = b

//    println(a.number) // 에러
//    a.hello() // 에러
    println(b.number)
    b.hello()
}