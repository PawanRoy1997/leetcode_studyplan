package pawanroy.leetcode.`1512-number-of-good-pair`

class Solution {
    fun numIdenticalPairs(nums: IntArray): Int {
        var result = 0
        nums.forEachIndexed {index, number ->
            var i = index +1
            while(i < nums.size) {
                if(number == nums[i]) result++
                i++
            }
        }

        return result
    }
}