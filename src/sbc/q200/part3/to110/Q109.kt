package sbc.q200.part3.to110
/*
    리시버가 붙은 함수 리터럴
 */
fun main() {
    // Int 리시버를 [left,right]범위 이내로 가공하여 반환하는 확장 함수
    val makeSure:Int.(left:Int,right:Int)->Int

    makeSure = {
        left:Int,right:Int ->
        if (this<left) left // 리시버가 붙은 리터럴 함수는 리시버를 나타내는 this 키워드를 사용 가능
        else if(this>right)right
        else this
    }

    println(15.makeSure(20,40))
    println(18.makeSure(0,50))
    println(25.makeSure(0,19))
}