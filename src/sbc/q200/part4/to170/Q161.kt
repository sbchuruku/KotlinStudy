package sbc.q200.part4.to170

/*
    let 확장 함수 : 코드 중복 줄이기
 */

fun main()
{
    val a = 10
    val b = 5

    /*
        let 함수를 쓰면 (a * b - 2 * a) 의 결과가 첫번째 매개변수인 result 로 들어가게 된다.
     */
    (a * b - 2 * a).let { result:Int ->
        if (result > 0)
            println(result)
    }
}