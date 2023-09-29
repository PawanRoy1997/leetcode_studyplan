package pawanroy.leetcode.`896-monotonic-array`

class Solution {
    fun isMonotonic(nums: IntArray): Boolean {
        var inc = true
        var dec = true
        var prev = nums.first()
        for(current in nums){
            if(prev < current) dec = false
            if(prev > current) inc = false

            prev = current
            if(!(inc || dec)) return false
        }

        return true
    }
}