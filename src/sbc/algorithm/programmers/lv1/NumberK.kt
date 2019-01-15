package algorithm.programmers.lv1

class Solution2 {
    fun solution(array: IntArray, commands: Array<IntArray>): IntArray {

        var answer = intArrayOf()

        for (cmd in commands) {
            var splitArray:IntArray = intArrayOf()

            for (i in cmd[0]..cmd[1]) {
                splitArray += array[i-1]
            }

            splitArray.sort()

            answer += splitArray[cmd[2]-1]
        }

        for (a in answer) {
            println(a)
        }

        return answer
    }
}

fun main(args: Array<String>) {
    var sol = Solution2()
    var array:IntArray = intArrayOf(1, 5, 2, 6, 3, 7, 4)
    var commands:Array<IntArray> = arrayOf(intArrayOf(2,5,3), intArrayOf(4,4,1), intArrayOf(1,7,3))

    sol.solution(array,commands)
}