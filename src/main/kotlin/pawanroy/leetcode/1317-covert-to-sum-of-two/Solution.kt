package pawanroy.leetcode.`1317-covert-to-sum-of-two`

class Solution {
    fun getNoZeroIntegers(n: Int): IntArray {
        fun isNoZero(x: Int) = '0' !in x.toString()

        for (a in 1 until n) {
            val b = n - a
            if (isNoZero(a) && isNoZero(b)) {
                return intArrayOf(a, b)
            }
        }
        return intArrayOf(1, n-1)
    }
}
