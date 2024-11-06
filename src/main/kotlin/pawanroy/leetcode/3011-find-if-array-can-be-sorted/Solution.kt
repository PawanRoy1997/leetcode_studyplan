package pawanroy.leetcode.`3011-find-if-array-can-be-sorted`

class Solution {
    fun canSortArray(nums: IntArray): Boolean {
        var parityMax = 0
        var currentMin = 0
        var currentMax = 0
        var parityCount:Byte = 0
        for (v in nums) {
            val currentCount = Integer.bitCount(v).toByte()
            if (parityCount == currentCount) {
                currentMin = minOf(v, currentMin)
                currentMax = maxOf(v, currentMax)
            } else if (currentMin < parityMax) {
                return false
            } else {
                parityMax = currentMax
                currentMax = v
                currentMin = currentMax
                parityCount = currentCount
            }
        }
        return currentMin >= parityMax
    }
}