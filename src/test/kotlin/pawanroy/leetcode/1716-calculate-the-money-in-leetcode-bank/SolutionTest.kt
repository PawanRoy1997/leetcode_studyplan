package pawanroy.leetcode.`1716-calculate-the-money-in-leetcode-bank`

import kotlin.test.Test
import kotlin.test.assertEquals

class SolutionTest {
    private val sol = Solution()

    @Test
    fun caseOne() {
        assertEquals(10, sol.totalMoney(4))
    }

    @Test
    fun caseTwo() {
        assertEquals(37, sol.totalMoney(10))
    }

    @Test
    fun caseThree(){
        assertEquals(96, sol.totalMoney(20))
    }
}