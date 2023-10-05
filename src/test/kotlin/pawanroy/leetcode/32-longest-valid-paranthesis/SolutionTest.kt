package pawanroy.leetcode.`32-longest-valid-paranthesis`

import kotlin.test.Test
import kotlin.test.assertEquals

class SolutionTest {
    private val sol = Solution()

    @Test
    fun caseOne(){
        assertEquals(2, sol.longestValidParentheses("(()"))
    }

    @Test
    fun caseTwo(){
        assertEquals(4, sol.longestValidParentheses(")()())"))
    }

    @Test
    fun caseThree(){
        assertEquals(0, sol.longestValidParentheses(""))
    }

    @Test
    fun caseFour(){
        assertEquals(2, sol.longestValidParentheses("()(()"))
    }
}