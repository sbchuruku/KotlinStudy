package part1.to10
/*
    산술연산자를 통한 연산
    코틀린은 자바보다 타입 체크에 엄격하기 때문에 Double 형에 Int 형 값을 넣을수 없다.
 */
fun main(args: Array<String>) : Unit
{
    val num : Int = 15 - 4 * 3
    val num2 : Int = 65 % 7
    val num3 : Double = 7.5 / 5 + 22.25
    val num4 : Double = num / num2 + 0.7

    println(num)
    println(num2)
    println(num3)
    println(num4)

}