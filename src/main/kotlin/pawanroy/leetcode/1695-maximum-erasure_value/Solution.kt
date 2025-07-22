package pawanroy.leetcode.`1695-maximum-erasure_value`

class Solution {
    fun maximumUniqueSubarray(nums: IntArray): Int {
        var score = 0
        var ptr = 0
        var result = 0
        val subArray = mutableSetOf<Int>()

        for (i in nums.indices) {
            while(subArray.contains(nums[i])) {
                subArray.remove(nums[ptr])
                score -= nums[ptr]
                ptr++
            }

            subArray.add(nums[i])
            score+= nums[i]
            result = maxOf(result, score)
        }

        return result
    }
}