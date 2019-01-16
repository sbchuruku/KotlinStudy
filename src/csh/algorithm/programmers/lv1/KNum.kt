package csh.algorithm.programmers.lv1

import java.util.Arrays

fun main(args: Array<String>) {

    /*val nums = arrayOf(1, 2, 3, 4, 5)
    println(nums.get(0))

    nums.set(0, 2)
    println(Arrays.toString(nums))

    val nums2 = nums.plus(1)
    println(Arrays.toString(nums2))

    val slice = nums.sliceArray(1..3)
    println(Arrays.toString(slice))

    println(nums.first())
    println(nums.last())
    println(nums.indexOf(5))
*/

    var sol = Solution()
    var array:Array<Int> = arrayOf(1, 5, 2, 6, 3, 7, 4)
    var commands:Array<IntArray> = arrayOf(arrayOf(2,5,3).toIntArray(), arrayOf(4,4,1).toIntArray(), arrayOf(1,7,3).toIntArray())
    sol.solution(array.toIntArray(), commands)
}

class Solution {
    fun solution(array: IntArray, commands: Array<IntArray>): IntArray {
        var answer = intArrayOf()

        for(i in 0..(commands.size-1))
        {
            var tempArray = array.sliceArray((commands[i][0]-1)..(commands[i][1]-1))
            tempArray.sort()
            println(tempArray[(commands[i][2]-1)])
            answer = answer.plus(tempArray[(commands[i][2]-1)])
        }

        return answer
    }
}