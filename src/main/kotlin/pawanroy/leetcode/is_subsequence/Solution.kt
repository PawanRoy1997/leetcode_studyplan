package pawanroy.leetcode.is_subsequence

class Solution {
    fun isSubsequence(s: String, t: String): Boolean {

        val subStringLength = s.length
        if (subStringLength == 0) {
            return true
        }
        if (t.length < subStringLength) {
            return false
        }
        if (subStringLength == t.length) {
            return s.equals(t, false)
        }
        var index = 0
        for (char in t.toCharArray()) {
            if (char == s.toCharArray()[index]) {
                index++
            }
            if (index == subStringLength) return true
        }

        return false
    }
}