package pawanroy.leetcode.`2439-minimize-maximum-of-array`

class Solution {
    fun minimizeArrayValue(nums: IntArray): Int {
        var sum: Long = 0
        var result: Long = 0
        for (index in nums.indices) {
            sum += nums[index].toLong()
            result = maxOf(result, (sum + index) / (index + 1))
        }
        return result.toInt()
    }
}