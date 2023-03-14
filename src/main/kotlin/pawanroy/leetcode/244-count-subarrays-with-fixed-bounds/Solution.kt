package pawanroy.leetcode.`244-count-subarrays-with-fixed-bounds`

import kotlin.math.min

internal class Solution {
    fun countSubarrays(nums: IntArray, minK: Int, maxK: Int): Long {
        var startIndex = -1
        var minIndex = -1
        var maxIndex = -1
        var result: Long = 0
        for (i in nums.indices) {
            if (nums[i] in minK..maxK) {
                if (nums[i] == minK) minIndex = i
                if (nums[i] == maxK) maxIndex = i
                if (minIndex != -1 && maxIndex != -1)
                    result += (min(minIndex, maxIndex) - startIndex).toLong()
            } else {
                startIndex = i
                minIndex = -1
                maxIndex = -1
            }
        }
        return result
    }
}