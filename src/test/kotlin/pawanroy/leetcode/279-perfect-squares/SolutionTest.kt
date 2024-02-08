package pawanroy.leetcode.`279-perfect-squares`

import kotlin.test.Test
import kotlin.test.assertEquals

class SolutionTest {
    private val sol = Solution()

    @Test
    fun caseOne(){
        assertEquals(3, sol.numSquares(12))
    }
    @Test
    fun caseTwo(){
        assertEquals(2, sol.numSquares(13))
    }
}