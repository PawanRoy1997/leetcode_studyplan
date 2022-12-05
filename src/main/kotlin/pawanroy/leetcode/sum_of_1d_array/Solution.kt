package pawanroy.leetcode.sum_of_1d_array

class Solution {
    fun runningSum(nums: IntArray): IntArray {
        var sum = 0
        val result = IntArray(nums.size)
        nums.map {
            sum += it
            sum
        }.forEachIndexed { index, value ->
            result[index] = value
        }
        return result
    }
}