package pawanroy.leetcode.`2182-contruct-string-with-repeat-limit`


class Solution {
    fun repeatLimitedString(s: String, repeatLimit: Int): String {
        val frequency = IntArray(26) { 0 }
        s.forEach { frequency[it.code - 'a'.code]++ }

        var i = 25
        var j = i

        var count = 0
        val ans = StringBuilder()

        while (i >= 0 && j >= 0) {
            while (i >= 0 && frequency[i] == 0) i--
            if (i < 0) continue


            if (count < repeatLimit) {
                ans.append((i + 'a'.code).toChar())
                frequency[i]--
                if (frequency[i] == 0) count = 0
                else count++

            } else {
                j = i - 1
                while (j >= 0 && frequency[j] == 0) j--

                if (j < 0) continue

                ans.append((j + 'a'.code).toChar())
                frequency[j]--
                count = 0
            }
        }
        return ans.toString()
    }
}