package pawanroy.leetcode.`45-jump-game`

class Solution {
    fun jump(nums: IntArray): Int {
        var jumps = 0
        var currentEnd = 0
        var farthest = 0

        for (i in 0 until nums.lastIndex) {
            farthest = maxOf(farthest, i + nums[i])
            if (i == currentEnd) {
                jumps++
                currentEnd = farthest
            }
        }

        return jumps
    }
}