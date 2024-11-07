package pawanroy.leetcode.`2275-largest-combination-with-bitwise-and-greater-than-zero`

class Solution {
    fun largestCombination(candidates: IntArray): Int {
        var res = 1
        var count = 0
        for(i in 0..25){
            count = 0
            candidates.forEachIndexed { index, i ->
                count += i and 1
                candidates[index] = i shr 1
            }
            res = maxOf(res, count)
        }
        return res
    }
}