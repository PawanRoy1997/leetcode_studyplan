package pawanroy.leetcode.`362-maximum-width-ramp`

class Solution {
    fun maxWidthRamp(nums: IntArray): Int {
        var max = 0
        nums.forEachIndexed{ index: Int, start: Int ->
            if(nums.lastIndex - index > max){
                for(i in nums.lastIndex downTo index+1){
                    if((i - index > max) && nums[i] >= start){
                        max = maxOf(i - index, max)
                    }
                }
            }
        }

        return max
    }
}