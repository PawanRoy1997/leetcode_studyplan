package pawanroy.leetcode.`1590-make-sum-divisible-by-p`


class Solution {
    fun minSubarray(nums: IntArray, p: Int): Int {
        var totalSum: Long = 0
        for (num in nums) {
            totalSum += num
        }

        // Find remainder when total sum is divided by p
        val rem = (totalSum % p).toInt()
        if (rem == 0) return 0 // If remainder is 0, no subarray needs to be removed


        val prefixMod = HashMap<Int, Int>()
        prefixMod[0] = -1 // Initialize to handle full prefix
        var prefixSum: Long = 0
        var minLength = nums.size

        for (i in nums.indices) {
            prefixSum += nums[i].toLong()
            val currentMod = (prefixSum % p).toInt()
            val targetMod = (currentMod - rem + p) % p

            if (prefixMod.containsKey(targetMod)) {
                minLength = minOf(minLength, i - (prefixMod[targetMod] ?: -1))
            }

            prefixMod[currentMod] = i
        }

        return if (minLength == nums.size) -1 else minLength
    }
}