package sbc.q200.part4.to160

/*
    run 확장 함수 : 코드 중복 줄이기
 */

fun main()
{
    val a = 10
    val b = 5

    /*
        if (a * b - 2 * a > 0)
            println(a * b - 2 * a)

        위와 같은 형태의 코드를 아래와 같이 구현 가능
        결과적으로 중복되는 부분을 this 로 대체 할 수 있다.
     */
    (a * b - 2 * a).run {
        if (this > 0)
            println(this)
    }
}