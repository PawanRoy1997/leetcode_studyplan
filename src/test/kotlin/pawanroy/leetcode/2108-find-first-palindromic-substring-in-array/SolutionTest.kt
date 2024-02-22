package pawanroy.leetcode.`2108-find-first-palindromic-substring-in-array`

import kotlin.test.Test
import kotlin.test.assertEquals

class SolutionTest {
    private val sol = Solution()

    @Test
    fun caseOne() {
        assertEquals("ada", sol.firstPalindrome(arrayOf("abc", "car", "ada", "racecar", "cool")))
    }

    @Test
    fun caseTwo() {
        assertEquals("", sol.firstPalindrome(arrayOf()))
    }

    @Test
    fun caseThree(){
        assertEquals("racecar", sol.firstPalindrome(arrayOf("notapalindrome","racecar")))
    }
}