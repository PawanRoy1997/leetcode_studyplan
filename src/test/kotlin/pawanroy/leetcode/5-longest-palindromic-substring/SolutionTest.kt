package pawanroy.leetcode.`5-longest-palindromic-substring`

import org.junit.jupiter.api.Test
import kotlin.test.assertContains
import kotlin.test.assertEquals

class SolutionTest{
    private val solution = Solution()
    @Test
    fun caseOne(){
        assertContains(arrayOf("aba","bab"),solution.longestPalindrome("babad"))
    }
    @Test
    fun caseTwo(){
        assertEquals("bb",solution.longestPalindrome("cbba"))
    }
    @Test
    fun caseThree(){
        assertEquals("bb",solution.longestPalindrome("bb"))
    }
    @Test
    fun caseFour(){
        assertEquals("bbb",solution.longestPalindrome("bbb"))
    }

    @Test
    fun caseFive(){
        assertEquals("bbbb",solution.longestPalindrome("bbbb"))
    }

    @Test
    fun caseSix(){
        assertEquals("bbbbb",solution.longestPalindrome("bbbbb"))
    }
    @Test
    fun caseSeven(){
        assertEquals("abbbbba",solution.longestPalindrome("abbbbba"))
    }
}