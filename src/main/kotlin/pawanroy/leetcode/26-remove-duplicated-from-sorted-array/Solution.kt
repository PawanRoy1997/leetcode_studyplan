package pawanroy.leetcode.`26-remove-duplicated-from-sorted-array`

class Solution {
    fun removeDuplicates(numbers: IntArray): Int {
        var result = 0
        var lastNumber = -10000
        numbers.forEach {
            if(it != lastNumber) {
                numbers[result] = it
                result++
                lastNumber = it
            }
        }
        return result
    }
}