package pawanroy.leetcode.`13-roman-to-integer`

class Solution {

    private fun getValue(c: Char): Int {
        return when (c) {
            'I' -> 1
            'V' -> 5
            'X' -> 10
            'L' -> 50
            'C' -> 100
            'D' -> 500
            'M' -> 1000
            else -> 0
        }
    }

    fun romanToInt(s: String): Int {
        var result = 0
        var current: Int
        var prev: Int
        for (i in s.indices) {
            current = getValue(s[i])
            prev = if (i > 0) getValue(s[i - 1]) else 2000
            result += if (prev < current) current - (2 * prev) else current
        }

        return result
    }
}