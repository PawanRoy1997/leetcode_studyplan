package pawanroy.leetcode.`704-binary-search`

class Solution {
    fun search(nums: IntArray, target: Int): Int {
        var startIndex = 0
        var endIndex = nums.size
        var index = 0
        for (i in 0..13) {
            index = startIndex + endIndex
            index = ((index) / 2)
            if (target == nums[index]) {
                break
            }
            if (target > nums[index]) {
                startIndex = index
            } else {
                endIndex = index
            }
        }
        return if (target == nums[index]) index else -1
    }
}