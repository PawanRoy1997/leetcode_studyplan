package pawanroy.leetcode.`1312-minimum-insertion-to-make-a-single-palindrome`

class Solution {
    fun minInsertions(s: String): Int {
        val dp = Array(s.length) { IntArray(s.length) { 0 } }

        for (i in (s.lastIndex) downTo 0) {
            for (j in i + 1..s.lastIndex) {
                dp[i][j] = if (s[i] == s[j])
                    dp[i + 1][j - 1]
                else
                    minOf(dp[i + 1][j], dp[i][j - 1]) + 1
            }
        }

        return dp[0][s.lastIndex]
    }
}