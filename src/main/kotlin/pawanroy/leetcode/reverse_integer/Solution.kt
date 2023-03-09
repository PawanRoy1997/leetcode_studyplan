package pawanroy.leetcode.reverse_integer

class Solution {
    fun reverse(x: Int): Int {
        val negative = x < 0
        var original: Int = if (negative) -1 * x else x
        if (original < 0) return 0
        var reversed = 0
        val maxRange = Integer.MAX_VALUE / 10
        while (original != 0) {
            if (reversed > maxRange) return 0
            reversed *= 10
            reversed += original % 10
            original /= 10
        }
        return if (negative) -1 * reversed else reversed
    }
}