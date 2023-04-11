package pawanroy.leetcode.`1480-running-sum-1d-array`

class Solution {
    fun runningSum(nums: IntArray): IntArray {
        for (i in 1..nums.lastIndex) nums[i] += nums[i - 1]
        return nums
    }
}