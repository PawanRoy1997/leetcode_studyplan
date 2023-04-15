package pawanroy.leetcode.`344-reverse-string`

class Solution {
    fun reverseString(s: CharArray) {
        val limit = s.lastIndex / 2
        var c: Char
        for (i in 0..limit) {
            c = s[i]
            s[i] = s[s.lastIndex - i]
            s[s.lastIndex - i] = c
        }
    }
}