package sbc.q200.part4.to189

/*
    인수(Argument) 검증하기
 */

fun func(num:Int?)
{
    checkNotNull(num)
    check(num!!>=0)
}

fun func2(num:Double?)
{
    requireNotNull(num)
    require(num!!.isNaN())
}

fun main()
{
    func(10)
    func2(0.0/0.0)
}