package pawanroy.leetcode.`1-two-sum`

class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        for(i in 0 until nums.lastIndex){
            for(j in i+1..nums.lastIndex){
                if(nums[j] == target - nums[i]){
                    return intArrayOf(i,j)
                }
            }
        }
        return intArrayOf()
    }
}