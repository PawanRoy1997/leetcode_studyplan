package pawanroy.leetcode.`1679-max-number-of-k-sum-pairs`

class Solution {
    fun maxOperations(nums: IntArray, k: Int): Int {
        if(nums.size < 2) return 0
        val isRemoved = Array(nums.size) { false }
        var count = 0
        for(i in 0 until nums.lastIndex){
            if(isRemoved[i]) continue
            for(j in 1 .. nums.lastIndex){
                if(isRemoved[j]) continue
                if(nums[i]+nums[j] == k){
                    count++
                    isRemoved[i] = true
                    isRemoved[j] = true
                    break
                }
            }
        }
        return count
    }
}