package pawanroy.leetcode.`1480-running-sum-1d-array`

class Solution {
    fun runningSum(nums: IntArray): IntArray {
        var num = 0
        return nums.map { num += it;num }.toIntArray()
    }
}