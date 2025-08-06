package pawanroy.leetcode.`904-fruits-into-basket`

import kotlin.test.Test
import kotlin.test.assertEquals

class SolutionTest {
    private val sol = Solution()

    @Test
    fun caseSimple() {
        assertEquals(3, sol.totalFruit(intArrayOf(1,2,1)))
    }

    @org.junit.jupiter.api.Test
    fun caseComplex() {
        assertEquals(3, sol.totalFruit(intArrayOf(1,0,3,4,3)))
    }
}