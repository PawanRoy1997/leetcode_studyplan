package pawanroy.leetcode.`392-is-subsequence`

class Solution {
    fun isSubsequence(s: String, t: String): Boolean {
        if (s.isEmpty()) return true
        if (t == s) return true
        if (t.length < s.length) return false

        val sArr = s.toCharArray()
        var sp = 0
        t.toCharArray().forEach {
            if (it == sArr[sp]) {
                sp++
                if (sp == s.length) return true
            }
        }

        return false
    }
}