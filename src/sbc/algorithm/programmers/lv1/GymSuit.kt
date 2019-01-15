package sbc.algorithm.programmers.lv1

class Solution3 {
    fun solution(n: Int, lost: IntArray, reserve: IntArray): Int {
        var answer = 0

        if (lost.isEmpty()) {
            return n
        } else {
            answer += (n - lost.size)
        }

        var resList = reserve.clone().toMutableList()

        if (resList.isNotEmpty()) {
            for (l in lost) {

                if (l in resList) {
                    resList.remove(l)
                    answer += 1
                    continue
                }

                if (l-1 > 0 && l-1 in resList) {
                    resList.remove(l-1)
                    answer += 1
                    continue
                }

                if (l+1 <= n && l+1 in resList) {
                    resList.remove(l+1)
                    answer += 1
                    continue
                }
            }
        }

        return answer
    }
}

fun main(args: Array<String>) {
    var sol = Solution3()
    println(sol.solution(5, intArrayOf(2,4), intArrayOf(1,3,5)))
    println(sol.solution(5, intArrayOf(2,4), intArrayOf(3)))
}