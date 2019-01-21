package sbc.q200.part2.to87

/*
    확장 함수 : 상속 없이 클래스 외부에서 멤버함수를 추가할 수 있다.
 */

// 문자열이 숫자로만 이루어져 있는지 판단하는 확장 함수
fun String.isNumber():Boolean { // 주입할 String 클래스를 리시버 타입 이라고 부른다.
    var i = 0
    while(i < this.length) { // this 를 사용하면 리시버타입의 프로퍼티나 멤버함수에 접근 가능(단, private 나 protected 는 불가)
        // 숫자가 아닌 문자가 하나라도 들어있으면 false 반환
        if(!('0' <= this[i] && this[i] <= '9'))
            return false
        i += 1
    }
    // 모든 조건을 통과하면 true 반환
    return true
}

fun main(args: Array<String>) {
    println("1234567890".isNumber())
    println("500원".isNumber())
}