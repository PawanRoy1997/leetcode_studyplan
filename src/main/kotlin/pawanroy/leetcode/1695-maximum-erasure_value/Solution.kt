package pawanroy.leetcode.`1695-maximum-erasure_value`

import java.util.LinkedList
import java.util.Queue

class Solution {
    fun maximumUniqueSubarray(nums: IntArray): Int {
        val subArray: Queue<Int> = LinkedList()
        var score = 0
        var result = 0
        for(i in nums.indices){
            while(subArray.contains(nums[i])){
                score -= subArray.poll()
            }
            score+= nums[i]
            subArray.offer(nums[i])
            result = maxOf(result, score)
        }

        return result
    }
}