package pawanroy.leetcode.`53-maximum-subarray`

class Solution {
    fun maxSubArray(nums: IntArray): Int {
        var sum = 0
        var max = nums[0]
        for (i in 0..nums.lastIndex) {
            sum += nums[i]
            if (max < sum) max = sum
            if (sum < 0) sum = 0
        }

        return max
    }
}