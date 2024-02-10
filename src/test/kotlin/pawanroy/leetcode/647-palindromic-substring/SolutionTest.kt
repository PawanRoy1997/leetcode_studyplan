package pawanroy.leetcode.`647-palindromic-substring`

import kotlin.test.Test
import kotlin.test.assertEquals

class SolutionTest {
    private val sol = Solution()

    @Test
    fun caseOne(){
        assertEquals(3, sol.countSubstrings("abc"))
    }

    @Test
    fun caseTwo(){
        assertEquals(6, sol.countSubstrings("aaa"))
    }
}