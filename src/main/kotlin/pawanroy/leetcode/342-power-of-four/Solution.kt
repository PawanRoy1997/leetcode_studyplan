package pawanroy.leetcode.`342-power-of-four`

import kotlin.math.log

class Solution {
    fun isPowerOfFour(n: Int): Boolean {
        val remainder = log(n.toFloat(), 4f) % 1
        return remainder == 0f
    }
}