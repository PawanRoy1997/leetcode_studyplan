package pawanroy.leetcode.`1480-running-sum-1d-array`

class Solution {
    fun runningSum(nums: IntArray): IntArray {
        return nums.also { for(i in 1 until nums.size) nums[i]+= nums[i-1] }
    }
}