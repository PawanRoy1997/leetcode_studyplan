package pawanroy.leetcode.find_pivot_index

class Solution {
    fun pivotIndex(nums: IntArray): Int {
        var sum = 0f
        nums.forEach { sum += it }
        var pivotIndex = -1
        val halfSum = sum
        sum = 0f
        for (index in nums.indices) {
            if (sum == (halfSum - nums[index]) /2) {
                pivotIndex = index
                break
            }
            sum += nums[index]
        }
        return pivotIndex
    }
}