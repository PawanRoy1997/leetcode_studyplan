package pawanroy.leetcode.`2563-count=number-of-fair-pairs`

class Solution {
    fun countFairPairs(nums: IntArray, lower: Int, upper: Int): Long {
        nums.sort()
        return countUnder(nums,upper) - countUnder(nums, lower-1)
    }

    private fun countUnder(nums: IntArray, max: Int): Long{
        var res = 0L
        var i =0
        var j = nums.lastIndex
        while(i < j){
            while(i<j && nums[i]+nums[j] > max) j--
            res+=j-i
            i++
        }
        return res
    }
}