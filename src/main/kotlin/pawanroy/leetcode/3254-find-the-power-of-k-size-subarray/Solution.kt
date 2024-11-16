package pawanroy.leetcode.`3254-find-the-power-of-k-size-subarray`

class Solution {
    fun resultsArray(nums: IntArray, k: Int): IntArray {
        val result = IntArray((nums.size + 1) - k) { -1 }
        var i = 0
        var j: Int
        while(i <= result.lastIndex){
            var max = nums[i]
            j = 0
            while(j in 0 until  k-1){
                j++
                if(max == (nums[i+j]-1)){
                    max = maxOf(max, nums[i+j])
                }else{
                    max = -1
                    break
                }
            }
            result[i] = max
            i++
        }

        return result
    }
}