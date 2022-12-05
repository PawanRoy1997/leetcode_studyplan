package pawanroy.leetcode.two_sum

class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        var result = intArrayOf()
        for(firstIndex in nums.indices){
            for(secondIndex in (firstIndex+1) until nums.size){
                if(nums[firstIndex]+nums[secondIndex] == target){
                    result = intArrayOf(firstIndex,secondIndex)
                    break
                }
            }
            if(result.isNotEmpty()) break
        }
        return result
    }
}