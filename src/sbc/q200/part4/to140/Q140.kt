package sbc.q200.part4.to140

/*
    변경할 수 있는(Mutable) 컬렉션
 */

/*
    Collection 인터페이스는 컬렉션의 원소를 추가/삭제/수정 할 수 없기 때문에
    MutableCollection 인터페이스를 구현하는 컬렉션을 이용해야함
 */
fun main()
{
    val mutableList:MutableCollection<Int> = mutableListOf(1,2,4,2,3,2,5)
    println(mutableList)

    mutableList.add(1) // 1인 원소를 추가
    println(mutableList)

    mutableList.addAll(listOf(3,2,4)) // 3,2,4 를 추가
    println(mutableList)

    mutableList.remove(1) // 앞에서부터 원소가 1인 경우 삭제
    println(mutableList)

    mutableList.removeAll(listOf(1,2)) // 1 또는 2 가 해당하는 원소를 모드 삭제
    println(mutableList)

    mutableList.retainAll(listOf(3,5)) // 3 또는 5 를 제외하고 모두 삭제
    println(mutableList)

    mutableList.clear() // 모든 원소 삭제
    println(mutableList)
}