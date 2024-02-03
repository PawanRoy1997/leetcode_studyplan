package pawanroy.leetcode.`2966-divide-array-into-arrays-wth-max-difference`

class Solution {
    fun divideArray(nums: IntArray, k: Int): Array<IntArray> {
        val numbers = nums.sortedArray()
        val result = ArrayList<IntArray>()
        var success = true
        for (index in nums.indices step 3) {
            if (numbers[index + 1] - numbers[index] <= k && numbers[index + 2] - numbers[index] <= k) {
                result.add(intArrayOf(numbers[index], numbers[index + 1], numbers[index + 2]))
            } else {
                success = false
            }
        }

        return if (success) result.toTypedArray() else arrayOf()
    }
}