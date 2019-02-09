package sbc.q200.part4.to189

/*
    KotlinVersion 클래스 : 사용중인 코틀린 버전 알아내기
 */

fun main()
{
    val kotlinVersion:KotlinVersion = KotlinVersion.CURRENT // 현재 버전
    println("${kotlinVersion.major}.${kotlinVersion.minor}.${kotlinVersion.patch}")
    println(kotlinVersion.isAtLeast(1,1,0)) // 입력한 버전보다 상위인지 체크
}