package programmers.lv1

class Solution1 {
    fun solution(n: Int): Int {
        var answer = 0

        val input:String = n.toString()
        var cnt:Int = 0

        while (cnt < input.length) {
            answer += input[cnt].toString().toInt()
            cnt += 1
        }

        println(answer)

        return answer
    }
}