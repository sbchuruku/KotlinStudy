package part1.to10
/*
    정수 타입과 실수 타입
 */
fun main(args: Array<String>) : Unit
{
    val a : Byte = 125 // 표현식이 리터럴 Int 되어 있고 Byte 에 저장 가능한 범위면 저장 허용
    val b : Short = (100 + 200) * 100 // Int 값을 연산하여 Short 범위에 있으면 허용
    var c : Int = 12_4354_6538 // 숫자안에 _ 를 넣어 알아보기 편하게 해도됨 위치와 개수는 자유

    c = 0xFF_88_88 // 0x 로 시작하면 16진수
    c = 0b01010010_01100011_01110101_01000101 //0b 로 시작하면 2진수

    var d : Long = -543_7847_3984_7238_4723 // 정수값이 Int 를 초과하면 자동으로 Long 으로 전환

    c = a + b // Byte 변수 + Short 변수 = Int 변수
    d = c + 10L // 정수 뒤에 L 을 붙이면 무조건 Long

    var e : Float = 67.6f // 실수 뒤에 f 를 붙이면 Float 형으로
    val f : Double = 658.456

    e = (e + f).toFloat() // Float + Double = Double 이고 실수형 변수에 넣기 위해 Float 형으로 형변환

    println(e)

}