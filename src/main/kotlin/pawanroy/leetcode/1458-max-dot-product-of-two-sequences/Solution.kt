package pawanroy.leetcode.`1458-max-dot-product-of-two-sequences`


class Solution {
    fun maxDotProduct(nums1: IntArray, nums2: IntArray): Int {
        val m = nums1.size
        val n = nums2.size
        var current = IntArray(n + 1) { Int.MIN_VALUE }
        var previous = IntArray(n + 1) { Int.MIN_VALUE }
        for (i in 1..m) {
            for (j in 1..n) {
                val curr_product = nums1[i - 1] * nums2[j - 1]
                current[j] =
                    maxOf(
                        maxOf(maxOf(curr_product.toDouble(), previous[j].toDouble()), current[j - 1].toDouble()),
                        (curr_product + maxOf(0.0, previous[j - 1].toDouble()))
                    )
                        .toInt()
            }
            val temp = current
            current = previous
            previous = temp
        }
        return previous[n]
    }
}