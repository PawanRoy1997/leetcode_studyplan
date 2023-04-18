package pawanroy.leetcode.`1768-merge-string-alternatively`

class Solution {
    fun mergeAlternately(word1: String, word2: String): String {
        val max = maxOf(word1.length, word2.length)
        val res = StringBuilder()
        for (i in 0 until max) {
            if (i < word1.length) res.append(word1[i])
            if (i < word2.length) res.append(word2[i])
        }

        return res.toString()
    }
}