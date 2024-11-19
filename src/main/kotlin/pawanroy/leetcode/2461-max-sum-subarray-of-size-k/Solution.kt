package pawanroy.leetcode.`2461-max-sum-subarray-of-size-k`

class Solution {
    fun maximumSubarraySum(nums: IntArray, k: Int): Long {
        val map: MutableMap<Int, Int> = HashMap()
        var begin=0
        var currentSum=0L
        var maxSum=0L

        for(end in nums.indices){
            if((map[nums[end]] ?: 0) >= 1){
                while(begin < end){
                    currentSum -= nums[begin]
                    map[nums[begin]]=(map[nums[begin]]?:0) - 1
                    begin++
                }
            }

            map[nums[end]]=(map[nums[end]]?:0) + 1
            currentSum+=nums[end]

            if(end - begin == (k-1)){
                maxSum = maxOf(maxSum, currentSum)
                currentSum-=nums[begin]
                map[nums[begin]]=(map[nums[begin]]?:0) - 1
                begin++
            }
        }
        return maxSum
    }
}