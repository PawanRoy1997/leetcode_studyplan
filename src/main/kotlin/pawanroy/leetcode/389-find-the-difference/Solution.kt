package pawanroy.leetcode.`389-find-the-difference`

class Solution {
    fun findTheDifference(s: String, t: String): Char {
        var res = 0
        t.toCharArray().forEach { res += it.toInt() }
        s.toCharArray().forEach { res -= it.toInt() }
        return res.toChar()
    }
}