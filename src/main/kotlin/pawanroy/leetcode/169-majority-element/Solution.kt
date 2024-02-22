package pawanroy.leetcode.`169-majority-element`


class Solution {
    fun majorityElement(nums: IntArray): Int {
        var result = -1
        var count = 0
        nums.forEach { n ->
            if (count == 0) {
                result = n
            }
            if (n == result) count++ else count--
        }

        return result
    }
}