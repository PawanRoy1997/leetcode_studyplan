package pawanroy.leetcode.`1444-number-of-ways-of-cutting-a-pizza`

class Solution {
    fun ways(pizza: Array<String>, k: Int): Int {
        val m = pizza.size
        val n = pizza[0].length
        // dp[k][r][c] represents the number of ways to cut the remaining pizza into k pieces
        // starting from row r and column c
        val dp = Array(k) {
            Array(m) {
                arrayOfNulls<Int>(n)
            }
        }
        // preSum[r][c] is the total number of apples in pizza[r:][c:]
        val preSum = Array(m + 1) { IntArray(n + 1) }
        // Compute preSum using dynamic programming, starting from the bottom-right corner of the pizza
        for (r in m - 1 downTo 0) for (c in n - 1 downTo 0) preSum[r][c] =
            preSum[r][c + 1] + preSum[r + 1][c] - preSum[r + 1][c + 1] + if (pizza[r][c] == 'A') 1 else 0
        // Start the recursive function dfs with initial parameters
        // m = number of rows, n = number of columns, k = number of pieces we need to cut the pizza into,
        // r = row index where we start cutting, c = column index where we start cutting
        return dfs(m, n, k - 1, 0, 0, dp, preSum)
    }

    // Recursive function to compute the number of ways to cut the remaining pizza into k pieces
    private fun dfs(
        m: Int,
        n: Int,
        k: Int,
        r: Int,
        c: Int,
        dp: Array<Array<Array<Int?>>>,
        preSum: Array<IntArray>
    ): Int {
        // If the remaining piece has no apple, then it is an invalid cut and we return 0
        if (preSum[r][c] == 0) return 0
        // If we have found a valid way to cut the pizza into k pieces, then we return 1
        if (k == 0) return 1
        // If the dp array already contains the number of ways to cut the remaining pizza into k pieces
        // starting from row r and column c, then we return the value from the dp array
        if (dp[k][r][c] != null) return dp[k][r][c]!!
        var ans = 0
        // Cut the pizza horizontally at position nr if the upper piece contains at least one apple
        for (nr in r + 1 until m) if (preSum[r][c] - preSum[nr][c] > 0) ans =
            (ans + dfs(m, n, k - 1, nr, c, dp, preSum)) % 1000000007
        // Cut the pizza vertically at position nc if the left piece contains at least one apple
        for (nc in c + 1 until n) if (preSum[r][c] - preSum[r][nc] > 0) ans =
            (ans + dfs(m, n, k - 1, r, nc, dp, preSum)) % 1000000007
        // Memoize the result in the dp array and return the result
        return ans.also { dp[k][r][c] = it }
    }
}