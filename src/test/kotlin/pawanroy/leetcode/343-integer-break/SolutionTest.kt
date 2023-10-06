package pawanroy.leetcode.`343-integer-break`

import kotlin.test.Test
import kotlin.test.assertEquals

class SolutionTest {
    private val sol = Solution()

    @Test
    fun caseOne() {
        assertEquals(1, sol.integerBreak(2))
    }

    @Test
    fun caseTwo() {
        assertEquals(2, sol.integerBreak(3))
    }

    @Test
    fun caseThree() {
        assertEquals(36, sol.integerBreak(10))
    }

    @Test
    fun caseFour(){
        assertEquals(18, sol.integerBreak(8))
    }
}