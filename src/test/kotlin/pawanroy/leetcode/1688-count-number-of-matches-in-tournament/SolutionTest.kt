package pawanroy.leetcode.`1688-count-number-of-matches-in-tournament`

import kotlin.test.Test
import kotlin.test.assertEquals

class SolutionTest {
    private val sol = Solution()
    @Test
    fun caseOne(){
        assertEquals(6, sol.numberOfMatches(7))
    }

    @Test
    fun caseTwo(){
        assertEquals(13, sol.numberOfMatches(14))
    }
}