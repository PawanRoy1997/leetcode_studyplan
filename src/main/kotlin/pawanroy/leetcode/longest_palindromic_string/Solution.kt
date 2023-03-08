package pawanroy.leetcode.longest_palindromic_string

@Suppress("kotlin:S3776")
class Solution {
    fun longestPalindrome(s: String): String {
        var result = ""
        val builder = StringBuilder()
        val length = s.length
        for (i in 0..length - 2) {
            if (i > 0 && (s[i - 1] == s[i + 1])) for (j in 1..i) {
                if (i + j == length) break
                if (s[i - j] != s[i + j]) break
                if((2*j)+1 > result.length) {
                    builder.clear()
                    builder.append(s.substring(i-j,i+j+1))
                }
            }

            if (result.length < builder.length) result = builder.toString()

            if (s[i] == s[i + 1]) for (j in 0..i) {
                if (i + j + 1 == length) break
                if (s[i - j] != s[i + 1 + j]) break
                if((2*j)+2 > result.length) {
                    builder.clear()
                    builder.append(s.substring(i - j,i + j + 2))
                }
            }
            if (result.length < builder.length) result = builder.toString()
        }
        return result.ifEmpty { s.first().toString() }
    }
}