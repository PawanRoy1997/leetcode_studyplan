package pawanroy.leetcode.longest_palindrome

class Solution {
    private var intArray = IntArray(94)
    private var odds = 0
    fun longestPalindrome(s: String): Int {
        s.toCharArray().forEach {
            intArray[it-' ']++
        }
        odds = intArray.count { it % 2 != 0 }
        return if(odds>1) s.length - (odds-1) else s.length
    }
}