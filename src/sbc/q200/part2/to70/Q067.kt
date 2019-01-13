package sbc.q200.part2.to70

/*
    프로퍼티를 오버라이딩 하기
 */

open class AAA67 {
    open var number = 10 // 프로퍼티를 오버라이딩 하기 위해 open 키워드 사용
        get() {
            println("AAA number Getter 호출됨")
            return field
        }
        set(value) {
            println("AAA number Setter 호출됨")
            field = value
        }

    open val number2:Int = 0
}

class BBB67:AAA67() {
    override var number:Int
        get() {
            println("BBB number Getter 호출됨")
            return super.number // 오버라이딩을 했기 때문에 슈퍼클래스 프로퍼티의 Getter도 호출
        }
        set(value) {
            println("BBB number Setter 호출됨")
            super.number = value // 오버라이딩을 했기 때문에 슈퍼클래스 프로퍼티의 Setter 도 호출
        }

    override var number2: Int = 0 // 슈퍼클래스의 val 프로퍼티를 var 로 오버라이딩 가능
        get() = super.number2
        set // 디폴트 Setter
}

fun main(args: Array<String>) {
    val test = BBB67()
    test.number = 5
    test.number
}