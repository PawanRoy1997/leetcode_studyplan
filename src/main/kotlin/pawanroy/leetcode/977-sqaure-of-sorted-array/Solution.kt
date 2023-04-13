package pawanroy.leetcode.`977-sqaure-of-sorted-array`

class Solution {
    fun sortedSquares(nums: IntArray): IntArray {
        nums.forEachIndexed { index, i -> nums[index] = maxOf(i, -i) }
        val res = IntArray(nums.size)
        var c = 0
        nums.sort()
        nums.forEachIndexed { index, i ->
            if (index == 0 || nums[index - 1] != i) c = i * i
            res[index] = c
        }
        return res
    }
}