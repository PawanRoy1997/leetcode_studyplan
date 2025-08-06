package pawanroy.leetcode.`75-sort-colors`

class Solution {
    fun sortColors(nums: IntArray) {
        var head = 0
        var tail = nums.lastIndex
        var current = head
        var temp: Int
        while(current <= tail){
            if(nums[current] == 0){
                temp = nums[current]
                nums[current] = nums[head]
                nums[head] = temp
                head++
                current++
            }else if(nums[current] == 2){
                temp = nums[current]
                nums[current] = nums[tail]
                nums[tail] = temp
                tail--
            }else{
                current++
            }
        }
    }
}