package pawanroy.leetcode.`1913-max-product-difference-between-two-pairs`

class Solution {
    fun maxProductDifference(nums: IntArray): Int {
        var max1 = Int.MIN_VALUE
        var max2 = Int.MIN_VALUE
        var min1 = Int.MAX_VALUE
        var min2 = Int.MAX_VALUE

        nums.forEach {
            if (it > max1) {
                max2 = max1
                max1 = it
            } else {
                max2 = maxOf(max2, it)
            }

            if (it < min1) {
                min2 = min1
                min1 = it
            } else {
                min2 = minOf(it, min2)
            }
        }

        return (max1 * max2) - (min1 * min2)
    }
}