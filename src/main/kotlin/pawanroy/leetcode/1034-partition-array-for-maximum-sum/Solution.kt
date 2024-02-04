package pawanroy.leetcode.`1034-partition-array-for-maximum-sum`

internal class Solution {
    fun maxSumAfterPartitioning(arr: IntArray, k: Int): Int {
        val K = k + 1

        val dp = IntArray(k + 1) { 0 }

        for (start in arr.lastIndex downTo 0) {
            var currMax = 0
            val end = minOf(arr.size.toDouble(), (start + k).toDouble()).toInt()

            for (i in start until end) {
                currMax = maxOf(currMax.toDouble(), arr[i].toDouble()).toInt()
                dp[start % K] = maxOf(dp[start % K].toDouble(), (dp[(i + 1) % K] + currMax * (i - start + 1)).toDouble())
                    .toInt()
            }
        }
        return dp[0]
    }
}

