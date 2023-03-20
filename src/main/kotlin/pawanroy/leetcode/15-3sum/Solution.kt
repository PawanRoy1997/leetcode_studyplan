package pawanroy.leetcode.`15-3sum`

class Solution {
    fun threeSum(nums: IntArray): List<List<Int>> {

        if (nums.isEmpty()) {
            return emptyList()
        }
        val result = mutableListOf<List<Int>>()
        nums.sort()
        for (i in nums.indices) {
            var start = i + 1
            var end = nums.size - 1

            if (i > 0 && nums[i] == nums[i - 1]) {
                continue
            }
            while (start < end) {
                if (end < nums.size - 1 && nums[end] == nums[end + 1]) {
                    end--
                    continue
                }

                if (nums[i] + nums[start] + nums[end] == 0) {
                    result.add(listOf(nums[i], nums[start], nums[end]))
                    start++
                    end--
                } else if (nums[i] + nums[start] + nums[end] < 0) {
                    start++
                } else {
                    end--
                }
            }
        }

        return result

    }
}