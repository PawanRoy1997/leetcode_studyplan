package pawanroy.leetcode.`2275-largest-combination-with-bitwise-and-greater-than-zero`

class Solution {
    fun largestCombination(candidates: IntArray): Int {
        val counts = IntArray(24) { 0 }
        var index = 0
        var num: Int
        candidates.forEach { candidate ->
            index = 0
            num = candidate
            while (num > 0) {
                counts[index] += num % 2
                num /= 2
                index++
            }
        }
        return counts.max()
    }
}