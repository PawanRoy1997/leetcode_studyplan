package pawanroy.leetcode.`443-string-compression`

class Solution {
    fun compress(chars: CharArray): Int {
        var placingAt = 0
        var lastEnd = -1
        for (i in chars.indices) {
            if (i == chars.size - 1 || chars[i + 1] != chars[i]) {

                chars[placingAt] = chars[i]
                placingAt++

                val count = i - lastEnd
                if (count != 1) {
                    for (digit in count.toString()) {
                        chars[placingAt] = digit
                        placingAt++
                    }
                }

                lastEnd = i
            }
        }
        return placingAt
    }
}