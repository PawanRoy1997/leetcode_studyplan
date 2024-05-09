package pawanroy.leetcode.`2441-largest-positive-integer-that-exists-with-its-negative`

import kotlin.math.abs

class Solution {
    fun findMaxK(nums: IntArray): Int {
        val counters = IntArray(1024)
        var max = -1
        nums.forEach{ n ->
            val a = abs(n)
            counters[a] = counters[a] or if(n<0) 1 else 2
            if(counters[a]==3){
                max = maxOf(max, a)
            }
        }
        return max
    }
}