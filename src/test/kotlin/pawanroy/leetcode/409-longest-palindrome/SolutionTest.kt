package pawanroy.leetcode.`409-longest-palindrome`

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SolutionTest{
    @Test
    fun testCaseOne(){
        val longestPalindrome = Solution().longestPalindrome("abccccdd")
        assertEquals(7, longestPalindrome)
    }

    @Test
    fun testCaseTwo(){
        val longestPalindrome = Solution().longestPalindrome("a")
        assertEquals(1, longestPalindrome)
    }

    @Test
    fun testCaseThree(){
        val longestPalindrome = Solution().longestPalindrome("abccccddaa")
        assertEquals(9, longestPalindrome)
    }
}