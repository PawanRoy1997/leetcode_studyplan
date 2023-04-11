package pawanroy.leetcode.`2390-removing-stars-from-a-string`

class Solution {
    fun removeStars(s: String): String {
        var count = 0
        val sb = StringBuilder()
        val last = s.lastIndex
        for (i in s.indices) {
            if (s[last - i] == '*') count++
            else if (count > 0) count-- else sb.append(s[last - i])
        }

        return sb.reverse().toString()
    }
}