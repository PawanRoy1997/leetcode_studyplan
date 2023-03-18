package pawanroy.leetcode.`10-regular-expression-matching`


@Suppress("kotlin:S3776")
class Solution {
    fun isMatch(s: String, p: String): Boolean {
        val n = s.length
        val m = p.length
        val dp = Array(n + 1) {
            BooleanArray(m + 1)
        }
        dp[0][0] = true

        for (i in 0..n) {
//            Iterate all string
            for (j in 1..m) {
//                Iterate step 1 not from 0
                if (p[j-1] != '*') {
//                    If is not astrix then check previous pattern matches with previous character or previous pattern was.
                    if (i >= 1 && (s[i-1] == p[j-1] || p[j-1] == '.')) dp[i][j] = dp[i-1][j-1]
                } else {
//                    If is astrix then pattern is matching for . then
                    if (p[j-2] == '.') {
//                        If either of array parent are true then is true
                        dp[i][j] = (i >= 1 && dp[i-1][j]) || dp[i][j-2]
                    } else {
//                        Either of parent should be true and previous character should match with the pattern
                        dp[i][j] = (i >= 1 && s[i-1] == p[j-2] && dp[i-1][j]) || dp[i][j-2]
                    }
                }
            }
        }

        return dp[n][m]
    }
}