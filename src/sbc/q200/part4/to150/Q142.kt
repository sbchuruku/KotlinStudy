package sbc.q200.part4.to150

fun main()
{
    val list:MutableList<Char> = mutableListOf('c','a','z')
    println(list)

    list.add(1, '%') // 1 위치에 '%' 추가
    println(list)

    list.addAll(0, listOf('L','P')) // 0 위치에 'L','P' 추가
    println(list)

    println(list.set(2,'/')) // 2 위치의 원소를 '/'로 교체하고 원래 있던 값 c 리턴
    println(list)

    println(list.removeAt(4)) // 4 위치의 원소를 삭제하고 원래 있던 값 a 리턴
    println(list)
}