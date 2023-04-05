package pawanroy.leetcode.`58-length-of-last-word`

class Solution {
    fun lengthOfLastWord(s: String): Int {
        var len = 0
        for (i in s.lastIndex downTo 0) if (s[i] == ' ') {
            if (len != 0) break
        } else len++
        return len
    }
}