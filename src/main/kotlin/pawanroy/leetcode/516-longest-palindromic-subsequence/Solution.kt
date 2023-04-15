package pawanroy.leetcode.`516-longest-palindromic-subsequence`

class Solution {

    fun longestPalindromeSubseq(s: String): Int {
        val size = s.length
        if (size == 0) return 0
        val dp = Array(size) { IntArray(size) { -1 } }

        fun helper(left: Int, right: Int): Int {
            if (left == right) return 1
            if (left > right) return 0
            if (dp[left][right] != -1) return dp[left][right]
            if (s[left] == s[right]) {
                dp[left][right] = 2 + helper(left + 1, right - 1)
                return dp[left][right]
            }
            val leftIncrement = helper(left + 1, right)
            val rightIncrement = helper(left, right - 1)
            dp[left][right] = maxOf(leftIncrement, rightIncrement)
            return dp[left][right]
        }

        return helper(0, s.length - 1)
    }
}