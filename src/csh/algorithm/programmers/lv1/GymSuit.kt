package csh.algorithm.programmers.lv1

fun main(args: Array<String>) {


    var sol = Solution4()
    var lost = arrayOf(2, 4)
    var reserve = arrayOf(3)
    sol.solution(5, lost.toIntArray(), reserve.toIntArray())
}

class Solution4 {
    fun solution(n: Int, lost: IntArray, reserve: IntArray): Int {
        var answer = 0
        var student = Array(n) {1}

        for(i in 0..(lost.size-1))
            student[(lost[i] - 1)]--

        for(i in 0..(reserve.size-1))
            student[(reserve[i] - 1)]++

        for(i in 0..(n-1))
        {
            if(i==0 && student[i] == 0)
            {
                if(student[i+1] == 2)
                {
                    student[i+1]--
                    student[i]++
                    answer++
                    continue
                }
            }
            else if(i == n-1 && student[i] == 0)
            {
                if(student[i-1] == 2)
                {
                    student[i-1]--
                    student[i]++
                    answer++
                    continue
                }
            }
            else if(student[i] == 0)
            {
                if(student[i-1] == 2)
                {
                    student[i-1]--
                    student[i]++
                    answer++
                    continue
                }
                else if(student[i+1] == 2)
                {
                    student[i+1]--
                    student[i]++
                    answer++
                    continue
                }
            }
            else if(student[i] > 0)
                answer++
        }

        return answer
    }
}