package pawanroy.leetcode.`279-perfect-squares`


class Solution {
    fun numSquares(n: Int): Int {
        val dp = IntArray(n + 1) { Int.MAX_VALUE }
        dp[0] = 0
        for (i in 1..n) {
            var current = Int.MAX_VALUE
            var j = 1
            while (j * j <= i) {
                current = minOf(current, dp[i - j * j] + 1)
                ++j
            }
            dp[i] = current
        }
        return dp[n]
    }
}