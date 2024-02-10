package pawanroy.leetcode.`368-largest-divisible-subset`

import java.util.*


class Solution {
    fun largestDivisibleSubset(nums: IntArray): List<Int> {
        val n = nums.size
        val dp = IntArray(n)
        Arrays.fill(dp, 1)
        Arrays.sort(nums)

        var maxSize = 1
        var maxIndex = 0
        for (i in nums.indices) {
            for (j in 0 until i) {
                if (nums[i] % nums[j] == 0) {
                    dp[i] = maxOf(dp[i], (dp[j] + 1))
                    if (dp[i] > maxSize) {
                        maxSize = dp[i]
                        maxIndex = i
                    }
                }
            }
        }

        val result: MutableList<Int> = ArrayList()
        var num = nums[maxIndex]
        for (i in maxIndex downTo 0) {
            if (num % nums[i] == 0 && dp[i] == maxSize) {
                result.add(nums[i])
                num = nums[i]
                maxSize--
            }
        }

        return result
    }
}
