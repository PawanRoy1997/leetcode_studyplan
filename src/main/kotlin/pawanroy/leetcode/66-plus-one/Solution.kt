package pawanroy.leetcode.`66-plus-one`

class Solution {
    fun plusOne(digits: IntArray): IntArray {
        var carry = 1
        var i = digits.lastIndex
        while (carry == 1 && i >= 0) {
            if (digits[i] == 9) digits[i] = 0
            else {
                carry = 0
                digits[i] = digits[i] + 1
            }
            i--
        }

        return if (carry == 0) digits else IntArray(digits.size + 1) { if (it == 0) 1 else digits[it - 1] }
    }
}