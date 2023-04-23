package pawanroy.leetcode.`1416-restore-the-array`

class Solution {
    private lateinit var memo: IntArray

    fun numberOfArrays(s: String, k: Int): Int {
        memo = IntArray(s.length) { -1 }
        return numWays(s, k, 0)
    }

    private fun numWays(s: String, k: Int, i: Int): Int {
        if (i == s.length) return 1
        if (memo[i] != -1) return memo[i]
        memo[i] = 0
        if (s[i] == '0') return memo[i]
        var n = Character.getNumericValue(s[i]).toLong()
        var next = i
        while (n <= k) {
            memo[i] = (memo[i] + numWays(s, k, next+1)) % 1000000007
            next++
            if (next >= s.length) break
            n = n*10 + Character.getNumericValue(s[next])
        }
        return memo[i]
    }
}