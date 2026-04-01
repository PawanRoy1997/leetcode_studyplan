package pawanroy.leetcode.`3474-lexographically-smallest-generated-string`

class Solution {
    fun generateString(str1: String, str2: String): String {
        val n = str1.length
        val m = str2.length
        val len = n + m - 1

        val word = CharArray(len) { 'a' }
        val fixed = BooleanArray(len)

        for (i in 0 until n) {
            if (str1[i] == 'T') {
                for (j in 0 until m) {
                    val idx = i + j
                    if (fixed[idx] && word[idx] != str2[j]) return ""
                    word[idx] = str2[j]
                    fixed[idx] = true
                }
            }
        }

        for (i in 0 until n) {
            if (str1[i] == 'F') {
                var matches = true
                var changeIdx = -1

                for (j in m - 1 downTo 0) {
                    val idx = i + j
                    if (word[idx] != str2[j]) matches = false
                    if (changeIdx == -1 && !fixed[idx]) changeIdx = idx
                }

                if (!matches) continue

                if (changeIdx != -1) {
                    word[changeIdx] = if (word[changeIdx] == 'a') 'b' else 'a'
                } else {
                    return ""
                }
            }
        }

        return String(word)
    }
}