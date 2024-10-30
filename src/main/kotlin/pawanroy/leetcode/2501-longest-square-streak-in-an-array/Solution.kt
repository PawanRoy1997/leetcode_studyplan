package pawanroy.leetcode.`2501-longest-square-streak-in-an-array`

import kotlin.math.sqrt


class Solution {
    fun longestSquareStreak(nums: IntArray): Int {
        val candidates: MutableMap<Int, Int> = HashMap()
        var res = -1
        nums.sort()
        nums.forEach {
            val root = sqrt(it.toFloat())

            if (root % 1f == 0f && candidates.containsKey(root.toInt())) {
                candidates[it] = (candidates[root.toInt()] ?: 1) + 1

                res = maxOf(res, candidates[it] ?: 1)
            } else {
                candidates[it] = 1
            }
        }
        return res
    }
}