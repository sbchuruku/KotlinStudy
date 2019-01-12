package part2.to50
/*
    가비지 컬렉션
 */
fun main(args: Array<String>) {

    var result = ""
    var i = 1

    while (i <= 100) {
        result += "$i " // 기존의 값들이 반복적으로 메모리에 남겨져 있게 되는데
        i += 1          // 시스템(가비지 컬렉터)이 알아서 자동으로 메모리 해제를 해준다.
                        // 이때 프리징 현상이 생길 수 있다.
    }

    println(result)

}