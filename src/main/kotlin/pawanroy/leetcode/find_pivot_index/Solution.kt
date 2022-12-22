package pawanroy.leetcode.find_pivot_index

class Solution {
    fun pivotIndex(nums: IntArray): Int {
        val sum = nums.sum()
        var halfSum = 0
        var pivotIndex = -1
        for (i in nums.indices) {
            if (halfSum == sum - nums[i] - halfSum) {
                pivotIndex = i
                break
            }
            halfSum += nums[i]
        }
        return pivotIndex

    }
}