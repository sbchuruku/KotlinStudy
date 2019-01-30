package sbc.q200.part3.to100

/*
    추상 클래스
 */

// 단순이 학생, 교수, 직원 클래스를 하나의 타입으로 묶어주는 클래스
abstract class Person96 { // abstract 자체에 open 키워드가 포함되어 있다.
    abstract fun getSalary():Int // 추상 멤버 함수. 추상 프로퍼티도 abstract 로 만들 수 있다.
}

// 학생 클래스 tuition 은 한 학기 등록금
class Student(private val tuition:Int):Person96() {
    // 학생은 등록금을 납부하므로 salary 를 음수처리
    override fun getSalary() = -tuition // 추상 클래스를 상속 받으면 무조건 추상 멤버 함수를 오버라이딩 해야 한다.
                                        // 추상 클래스를 상속하는 서브클래스도 abstract 를 붙이면 추상 멤버함수를 반드시 오버라이딩하지
                                        // 않아도 되지만 다시 일반클래스로 상속할 때는 오버라이딩을 반드시 해야 한다.
}

// 교수 클래스 classCount 는 진행하는 수업의 수
class Professor(private val classCount:Int):Person96() {
    override fun getSalary(): Int = classCount * 200
}

// 학교 직원 클래스 initial 은 초봉, year 는 경력
class Employee(private val initial:Int, private val years:Int):Person96() {
    override fun getSalary(): Int = initial * (1.0 + years / 10.0).toInt()
}

// 구성원으로부터 학교의 재정을 구한다.
fun getFinance(vararg persons:Person96):Int {
    var i = 0
    var finance = 0
    while (i < persons.size) {
        finance -= persons[i].getSalary()
        i += 1
    }
    return finance
}

fun main(args: Array<String>) {
    val finance = getFinance(Student(330), Student(330), Professor(1), Professor(2),
        Employee(1300,2))
    println("학교 재정:$finance 만원")
}