package pawanroy.leetcode.`27-remove-element`

class Solution {
    fun removeElement(numbers: IntArray, number: Int): Int {
        var index = 0
        for (it in numbers) {
            if (it != number) {
                numbers[index] = it
                index++
            }
        }
        return index
    }
}