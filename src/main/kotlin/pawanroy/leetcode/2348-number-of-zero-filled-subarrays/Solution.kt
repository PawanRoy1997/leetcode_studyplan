package pawanroy.leetcode.`2348-number-of-zero-filled-subarrays`

class Solution {
    fun zeroFilledSubarray(nums: IntArray): Long {
        if (nums.isEmpty()) return 0L
        var count = 0L
        var result = 0L

        nums.forEach {
            if (it == 0) {
                count++
                result += count
            } else count = 0
        }

        return result
    }
}