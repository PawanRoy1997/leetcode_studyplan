package pawanroy.leetcode.`9-palindrome-number`

import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class SolutionTest {

    private val solution = Solution()

    @Test
    fun caseOne(){
        assertTrue( solution.isPalindrome(121) )
    }

    @Test
    fun caseTwo(){
        assertFalse( solution.isPalindrome(-121) )
    }
}