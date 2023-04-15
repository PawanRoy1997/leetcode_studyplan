package pawanroy.leetcode.`2218-maximum-value-of-k-coins-from-piles`


class Solution {
    fun maxValueOfCoins(piles: List<List<Int>>, k: Int): Int {
        // create a 2D array to store the maximum value of coins for choosing j coins from the first i piles
        val dp = Array(piles.size + 1) { IntArray(k + 1) { 0 } }
        // iterate through the array and compute the maximum value of coins for each subproblem
        for (i in 1..piles.size) {
            for (j in 1..k) {
                var cur = 0
                // try all possible choices for the current pile and update the maximum result
                for (x in 0 until minOf(piles[i - 1].size, j)) {
                    cur += piles[i - 1][x]
                    dp[i][j] = maxOf(dp[i][j], cur + dp[i - 1][j - x - 1])
                }
                // if not choosing any coin from the current pile gives a better result, use that instead
                dp[i][j] = maxOf(dp[i][j], dp[i - 1][j])
            }
        }
        // the last element of the array is the maximum value of coins for choosing k coins from all the piles
        return dp[piles.size][k]
    }
}