package pawanroy.leetcode.`334-increasing-triplet-subsequence`

class Solution {
    fun increasingTriplet(nums: IntArray): Boolean {
        var m1 = Integer.MAX_VALUE
        var m2 = Integer.MAX_VALUE
        nums.forEach { num ->
            if(num <= m1) m1 = num
            else if(num <= m2) m2 = num
            else return true
        }

        return false
    }
}