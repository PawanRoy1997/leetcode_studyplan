package pawanroy.leetcode.`1639-number-of-ways-to-form-a-target-string`


class Solution {
    fun numWays(words: Array<String>, target: String): Int {
        val wordSize = words[0].length
        val targetLI = target.lastIndex
        val mod = 1000000007
        val dp = IntArray(targetLI + 2); dp[0] = 1
        val count = Array(wordSize) { IntArray(26) }
        for (word in words) for (i in 0 until wordSize) count[i][word[i] - 'a']++
        for (i in 0 until wordSize) for (j in targetLI downTo 0) {
            dp[j + 1] += (dp[j].toLong() * count[i][target[j] - 'a'] % mod).toInt()
            dp[j + 1] %= mod
        }
        return dp[targetLI + 1]
    }
}