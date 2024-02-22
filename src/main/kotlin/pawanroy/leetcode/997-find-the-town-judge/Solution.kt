package pawanroy.leetcode.`997-find-the-town-judge`

class Solution {
    fun findJudge(n: Int, trust: Array<IntArray>): Int {
        if (trust.size == n) return -1
        if (trust.size <= n - 2) return -1
        val canBeJudge = BooleanArray(n + 1) { true }
        val followers = Array(n+1) { 0 }
        trust.forEach {
            followers[it[1]]++
            canBeJudge[it.first()] = false
        }

        var result = -1

        followers.forEachIndexed {index, value ->
            if(value == n-1 && canBeJudge[index]){
                result = index
            }
        }

        return result
    }
}