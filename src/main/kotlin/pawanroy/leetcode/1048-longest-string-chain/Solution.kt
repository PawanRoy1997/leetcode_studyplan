package pawanroy.leetcode.`1048-longest-string-chain`

class Solution {
    fun longestStrChain(words: Array<String>): Int {
        val chainLengths = IntArray(words.size) { 1 }

        val sortedArray = words.sortedBy { it.length }

        for (i in 1 until words.size) {
            var j = i - 1
            while (j >= 0) {
                if (sortedArray[i].length - 2 >= sortedArray[j].length) break
                if (isSubsequence(sortedArray[j], sortedArray[i])) {
                    chainLengths[i] = maxOf(chainLengths[j] + 1, chainLengths[i])
                }
                j--
            }
        }

        return chainLengths.max()
    }

    private fun isSubsequence(s: String, t: String): Boolean {
        if (s.isEmpty()) return true
        if (t.length <= s.length) return false

        val sArr = s.toCharArray()
        var sp = 0
        t.toCharArray().forEach {
            if (it == sArr[sp]) {
                sp++
                if (sp == s.length) return true
            }
        }

        return false
    }
}