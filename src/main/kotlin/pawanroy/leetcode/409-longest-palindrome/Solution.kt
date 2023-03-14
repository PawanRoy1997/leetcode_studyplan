package pawanroy.leetcode.`409-longest-palindrome`

class Solution {
    fun longestPalindrome(s: String): Int {
        val intArray = IntArray(128 )
        for(it in s) { intArray[it-' ']++ }
        val odds = intArray.count { it % 2 != 0 }
        return if (odds > 1) s.length - (odds - 1) else s.length
    }
}