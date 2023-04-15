package pawanroy.leetcode.`167-two-sum-2-input-array-is-sorted`

class Solution {
    fun twoSum(numbers: IntArray, target: Int): IntArray {
        for (i in 0 until numbers.lastIndex) for (j in i + 1..numbers.lastIndex) {
            if (numbers[i] + numbers[j] > target) break
            else if (numbers[i] + numbers[j] == target) return intArrayOf(i + 1, j + 1)
        }

        return intArrayOf(1, 2)
    }
}