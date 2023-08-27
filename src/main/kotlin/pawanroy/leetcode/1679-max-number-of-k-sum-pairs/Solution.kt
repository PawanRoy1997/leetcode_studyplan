package pawanroy.leetcode.`1679-max-number-of-k-sum-pairs`

import java.util.*

class Solution {
    fun maxOperations(nums: IntArray, k: Int): Int {
        Arrays.sort(nums)
        var count = 0
        var ptr1 = 0
        var ptr2 = nums.lastIndex
        while(ptr1 < ptr2){
            if(nums[ptr1]+ nums[ptr2] < k){
                ptr1 ++
            }else if(nums[ptr1]+nums[ptr2] > k){
                ptr2 --
            }else {
                count++
                ptr1++
                ptr2--
            }
        }
        return count
    }
}