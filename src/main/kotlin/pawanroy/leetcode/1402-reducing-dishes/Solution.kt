package pawanroy.leetcode.`1402-reducing-dishes`

class Solution {
    fun maxSatisfaction(satisfaction: IntArray): Int {
        var sum = 0
        var iSum = 0
        satisfaction.sortDescending()
        for (i in satisfaction.indices) {
            iSum += satisfaction[i]
            if (iSum < 0) break
            sum += iSum
        }
        return sum
    }
}