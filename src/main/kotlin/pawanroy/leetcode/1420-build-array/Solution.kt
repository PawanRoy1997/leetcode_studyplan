package pawanroy.leetcode.`1420-build-array`


class Solution {
    fun numOfArrays(n: Int, m: Int, k: Int): Int {
        val mod = 1000000007
        val dp = Array(m + 1) { IntArray(k + 1) }
        val prefix = Array(m + 1) { IntArray(k + 1) }
        val prevDp = Array(m + 1) { IntArray(k + 1) }
        val prevPrefix = Array(m + 1) { IntArray(k + 1) }
        for (j in 1..m) {
            prevDp[j][1] = 1
            prevPrefix[j][1] = j
        }
        for (i in 2..n) {
            for (maxNum in 1..m) {
                for (cost in 1..k) {
                    dp[maxNum][cost] = (maxNum.toLong() * prevDp[maxNum][cost] % mod).toInt()
                    if (maxNum > 1 && cost > 1) {
                        dp[maxNum][cost] = (dp[maxNum][cost] + prevPrefix[maxNum - 1][cost - 1]) % mod
                    }
                    prefix[maxNum][cost] = (prefix[maxNum - 1][cost] + dp[maxNum][cost]) % mod
                }
            }
            for (j in 1..m) {
                System.arraycopy(dp[j], 0, prevDp[j], 0, k + 1)
                System.arraycopy(prefix[j], 0, prevPrefix[j], 0, k + 1)
            }
        }
        return prefix[m][k]
    }
}