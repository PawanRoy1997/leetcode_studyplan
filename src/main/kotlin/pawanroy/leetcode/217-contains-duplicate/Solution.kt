package pawanroy.leetcode.`217-contains-duplicate`

class Solution {
    fun containsDuplicate(nums: IntArray): Boolean {
        return nums.toSet().size != nums.size
    }
}