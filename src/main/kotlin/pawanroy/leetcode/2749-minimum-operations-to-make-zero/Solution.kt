package pawanroy.leetcode.`2749-minimum-operations-to-make-zero`

class Solution {
    fun makeTheIntegerZero(num1: Int, num2: Int): Int {
        for (k in 1..60) {
            val target = num1.toLong() - k.toLong() * num2
            if (target < 0) continue
            val bits = target.countOneBits()
            if (k in bits..target) return k
        }
        return -1
    }
}
