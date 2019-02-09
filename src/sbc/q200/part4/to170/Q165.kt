package sbc.q200.part4.to170

/*
    lazy 함수 : 게으름 초기화를 하는 프로퍼티 대리자
 */

class AAA165
{
    var num:Int = 0
    val num2 by lazy { num * 5 }
}

fun main()
{
    val one = AAA165()
    println(one.num2) // 처음에 num2에 접근하는 순간 mum2 는 0으로 초기화
    one.num = 10 // 생성 후 프로퍼티 10으로 수정
    println(one.num2) // num2 는 이미 초기화 된 상태라 0 출력

    val two = AAA165()
    two.num = 4 // 생성 후 프로퍼티를 4로 수정
    println(two.num2) // 4로 바뀐 후 num2 에 접근하여 초기화 되어 20 출력
}
/*
    val view:View? by lazy { findViewById(R.id.view) }
    안드로이드 액티비티에서 findViewById 는 setContentView 가 호출되기 전에 무조건 null 이므로 프로퍼티 선언과 동시에 초기화를 하면 안된다.
    프로퍼티를 val 로 선언하고 싶으면 선언과 동시에 초기화가 되어야 하는데 이때 lazy 를 사용하여 setContentView 를 수행하고 view 에 접근하면 된다.
 */