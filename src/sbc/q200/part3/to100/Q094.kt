package sbc.q200.part3.to100

/*
    동반자 객체의 확장함수
 */

class Person94 { companion object }

fun Person94.Companion.create() = Person94 // 만든 클래스의 확장함수를 선언할때는 Companion 을 반드시 붙여준다.

fun main(args: Array<String>) { Person94.create() }