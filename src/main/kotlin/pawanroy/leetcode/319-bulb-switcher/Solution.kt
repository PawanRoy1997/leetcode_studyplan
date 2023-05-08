package pawanroy.leetcode.`319-bulb-switcher`

class Solution {
    fun bulbSwitch(n: Int): Int {
        var sum = -1
        val longN = n.toLong()
        for (i in 0..Int.MAX_VALUE) {
            val long = i.toLong()
            if (longN < long * long) break
            else sum++
        }
        return sum
    }
}
