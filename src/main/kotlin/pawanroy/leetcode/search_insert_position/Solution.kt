package pawanroy.leetcode.search_insert_position

class Solution {
    private var index = 0
    private var value = 0
    fun searchInsert(nums: IntArray, target: Int): Int {
        return searchLocation(0, nums.lastIndex, nums, target)
    }

    private fun searchLocation(startIndex: Int, lastIndex: Int, nums: IntArray, target: Int): Int {
        index = (startIndex + lastIndex) / 2
        value = nums[index]
        if (value == target) return index
        if (nums[startIndex] == target) return startIndex
        if (nums[lastIndex] == target) return lastIndex
        if (nums[lastIndex] < target) return lastIndex + 1
        if (startIndex == lastIndex) return if (nums[startIndex] < target) startIndex + 1 else startIndex
        return if (value > target)
            searchLocation(startIndex, index, nums, target)
        else
            searchLocation(index + 1, lastIndex, nums, target)
    }
}