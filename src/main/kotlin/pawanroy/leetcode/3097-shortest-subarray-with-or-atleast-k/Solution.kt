package pawanroy.leetcode.`3097-shortest-subarray-with-or-atleast-k`

class Solution {
    fun minimumSubarrayLength(nums: IntArray, k: Int): Int {
        var start=0
        var end=0
        var res = Int.MAX_VALUE
        var temp = nums[start]
        while(end <= nums.lastIndex && start <= end){
            if(temp == nums[end]) start = end

            temp = temp or nums[end]

            if(temp >= k){
                res = minOf(res, (end) - start)
            }
            if(start==end || temp < k) {
                end++
                continue
            }
            start++
            temp = 0
            for(i in start..end) temp = temp or nums[i]
        }
        return if(res == Int.MAX_VALUE) -1 else res + 1
    }
}