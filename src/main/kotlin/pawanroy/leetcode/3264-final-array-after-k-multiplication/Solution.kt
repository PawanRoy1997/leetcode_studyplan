package pawanroy.leetcode.`3264-final-array-after-k-multiplication`

class Solution {
    fun getFinalState(nums: IntArray, k: Int, multiplier: Int): IntArray {
        repeat(k){
            val min = nums.min()
            val i = nums.indexOf(min)

            nums[i] = nums[i]*multiplier
        }

        return nums
    }
}