package sbc.q200.part3.to127

/*
    sealed 클래스
 */

sealed class Outer // 자신의 중첩 클래스에만 상속을 허용
{
    class One:Outer()
    class Two:Outer()
    class Three:Outer()
}

//class Four:Outer()
// 1. 1.1 버전 이후 sealed 클래스와 같은 파일에 속해있기만 해도 상속 가능
// 2. 주석을 해제하면 main 에서 when 에 else 가 없을 경우 오류발생

fun main()
{
    val instance:Outer = Outer.Three()

    val text:String =
        when (instance)
        {
            is Outer.One -> "첫번째"
            is Outer.Two -> "두번째"
            is Outer.Three -> "세번째"
            //else -> "그외"
        }

    println(text)
}

