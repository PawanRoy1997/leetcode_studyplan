package pawanroy.leetcode.running_sum

class Solution {
    fun runningSum(nums: IntArray): IntArray {
        var num = 0
        return nums.map { num += it;num }.toIntArray()
    }
}