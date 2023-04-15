package pawanroy.leetcode.`283-move-zeros`

class Solution {
    fun moveZeroes(nums: IntArray) {
        var ptr = 0
        for (i in nums.indices) if (nums[i] != 0) nums[ptr++] = nums[i]

        for (i in ptr..nums.lastIndex) nums[i] = 0
    }
}