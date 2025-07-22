package pawanroy.leetcode.`16-3sum-closest`

class Solution {
    fun threeSumClosest(nums: IntArray, target: Int): Int {
        var ans = nums[0]+nums[1]+nums[2]
        for(i in 0..nums.lastIndex-2){
            for(j in i+1..nums.lastIndex-1){
                for(k in j+1..nums.lastIndex){
                    if(diff(target, ans) > diff(target, nums[i]+nums[j]+nums[k])){
                        ans = nums[i]+nums[j]+nums[k]
                    }
                }
            }
        }
        return ans
    }

    private fun diff(num1: Int, num2: Int) = if(num1>= num2) num1-num2 else num2 - num1
}