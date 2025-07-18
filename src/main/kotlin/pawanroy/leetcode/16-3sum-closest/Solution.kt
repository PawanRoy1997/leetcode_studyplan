package pawanroy.leetcode.`16-3sum-closest`

import java.util.Arrays

class Solution {
    fun threeSumClosest(nums: IntArray, target: Int): Int {
        Arrays.sort(nums)
        var ans = nums[0]+nums[1]+nums[2]
        var ptr1 = 0
        var ptr2 = 1
        var ptr3 = 2

        while(true){
            
        }

        return ans
    }

    private fun diff(num1: Int, num2: Int) = if(num1>= num2) num1-num2 else num2 - num1
}