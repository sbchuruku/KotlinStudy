package csh.algorithm.programmers.lv1

fun main(args: Array<String>) {


    var sol = Solution5()
    var test1 = arrayOf(1,2,3,4,5)
    var test2 = arrayOf(1,3,2,4,2)
    sol.solution(test1.toIntArray())
    sol.solution(test2.toIntArray())
}

class Solution5 {
    fun solution(answers: IntArray): IntArray {
        var answer = intArrayOf()

        var students = arrayOf(arrayOf(1,2,3,4,5), arrayOf(2,1,2,3,2,4,2,5), arrayOf(3,3,1,1,2,2,4,4,5,5))
        var currect = Array(students.size) {0}
        var max:Int?

        for(i in 0..(answers.size-1))
        {
            for(j in 0..(students.size-1))
            {
                if(answers[i] == students[j][i % students[j].size])
                {
                    currect[j]++
                }
            }
        }

        max = currect.max()

        for(i in 0..(currect.size-1))
        {
            if(currect[i] == max)
            {
                answer = answer.plus(i + 1)
            }
        }

        for(i in 0..(answer.size-1))
        {
            println(answer[i])
        }

        return answer
    }
}