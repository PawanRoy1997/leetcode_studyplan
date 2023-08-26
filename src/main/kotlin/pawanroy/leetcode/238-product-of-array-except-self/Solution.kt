package pawanroy.leetcode.`238-product-of-array-except-self`

class Solution {
    fun productExceptSelf(nums: IntArray): IntArray {
        val leftArray = IntArray(nums.size){1}
        val rightArray = IntArray(nums.size){1}
        val lastIndex = nums.lastIndex
        for(i in 1..lastIndex){
            leftArray[i] = leftArray[i-1] * nums[i-1]
            rightArray[lastIndex-i] = rightArray[lastIndex-i+1] * nums[lastIndex-i+1]
        }
        for(i in nums.indices){
            leftArray[i] *= rightArray[i]
        }
        return leftArray
    }
}