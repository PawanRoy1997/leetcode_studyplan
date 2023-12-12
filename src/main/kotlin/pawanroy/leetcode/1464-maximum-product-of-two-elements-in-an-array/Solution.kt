package pawanroy.leetcode.`1464-maximum-product-of-two-elements-in-an-array`

class Solution {
    fun maxProduct(nums: IntArray): Int {
        var max1 = 0
        var max2 = 0
        for (num in nums) {
            if(num >= max1) {
                max2 = max1
                max1 = num
            }else{
                max2 = maxOf(max2, num)
            }
        }

        return (max1 - 1) * (max2 - 1)
    }
}