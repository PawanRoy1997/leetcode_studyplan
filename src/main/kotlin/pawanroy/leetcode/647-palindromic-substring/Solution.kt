package pawanroy.leetcode.`647-palindromic-substring`

class Solution {
    fun countSubstrings(s: String): Int {
        if (s.length < 2) return 1
        val len = s.length
        var count = 0
        var j: Int
        for (i in s.indices) {
            j=0
            while (i < (len - j)) {
                if (s[i] == s[len-j-1] && s.substring(i, len - j).isPalindrome()) count++
                j++
            }
        }
        return count
    }

    private fun String.isPalindrome(): Boolean {
        val str = StringBuilder(this)
        return str.reverse().toString().equals(this, false)
    }
}