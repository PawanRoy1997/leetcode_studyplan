package pawanroy.leetcode.palindrome_number

class Solution {
    fun isPalindrome(x: Int): Boolean {
        if (x < 0) return false
        return if (x == 0) true
        else {
            val number = x.toString()
            number.reversed().equals(number, false)
        }
    }
}