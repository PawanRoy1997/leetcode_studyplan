package pawanroy.leetcode.`557-reverse-words-in-a-string`

class Solution {
    fun reverseWords(str: String): String {
        val s = str.toCharArray()
        var start = 0
        var c: Char

        fun reverse(start: Int, end: Int) {
            val mid = (end - start) / 2
            for (i in 0..mid) {
                c = s[start + i]
                s[start + i] = s[end - i]
                s[end - i] = c
            }
        }

        for (i in s.indices) {
            if (s[i] == ' ') {
                reverse(start, i - 1)
                start = i + 1
            }

            if (i == s.lastIndex) {
                reverse(start, i)
            }
        }
        return String(s)
    }
}