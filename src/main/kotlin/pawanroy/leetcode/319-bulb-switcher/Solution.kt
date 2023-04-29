package pawanroy.leetcode.`319-bulb-switcher`

class Solution {
    fun bulbSwitch(n: Int): Int {
        var l = 1L
        var r: Long = n.toLong()
        while (l <= r) {
            val mid = l + (r - l) / 2
            if (mid * mid == n.toLong()) {
                return mid.toInt()
            } else if (mid * mid < n.toLong()) {
                l = mid + 1
            } else {
                r = mid - 1
            }
        }
        return r.toInt()
    }
}
