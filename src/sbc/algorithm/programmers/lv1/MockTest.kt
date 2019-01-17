package sbc.algorithm.programmers.lv1

fun max(a:Int, b:Int):Int = if (a > b) a else b

class Solution4 {
    fun solution(answers: IntArray): IntArray {
        var answer = intArrayOf()

        var num1:Int = 0
        var num2:Int = 0
        var num3:Int = 0

        val num1Pattern:IntArray = intArrayOf(1,2,3,4,5)
        val num2Pattern:IntArray = intArrayOf(2,1,2,3,2,4,2,5)
        val num3Pattern:IntArray = intArrayOf(3,3,1,1,2,2,4,4,5,5)

        var idx1 = 0
        var idx2 = 0
        var idx3 = 0

        for (a in answers) {
            if (a == num1Pattern[idx1]) {
                num1 += 1
            }
            if (a == num2Pattern[idx2]) {
                num2 += 1
            }
            if (a == num3Pattern[idx3]) {
                num3 += 1
            }

            if (idx1 == num1Pattern.size-1) {
                idx1 = 0
            } else {
                idx1 += 1
            }

            if (idx2 == num2Pattern.size-1) {
                idx2 = 0
            } else {
                idx2 += 1
            }

            if (idx3 == num3Pattern.size-1) {
                idx3 = 0
            } else {
                idx3 += 1
            }
        }

        val max:Int = max(num1,max(num2,num3))

        if (num1 == max) {
            answer += 1
        }

        if (num2 == max) {
            answer += 2
        }

        if (num3 == max) {
            answer += 3
        }

        return answer
    }
}

fun main(args: Array<String>) {
    val sol = Solution4()

    for (i in sol.solution(intArrayOf(1,2,3,4,5))) {
        print("$i ")
    }

    println()

    for (i in sol.solution(intArrayOf(1,3,2,4,2))) {
        print("$i ")
    }

}