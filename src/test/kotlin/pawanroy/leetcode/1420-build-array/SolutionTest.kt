package pawanroy.leetcode.`1420-build-array`

import kotlin.test.Test
import kotlin.test.assertEquals

class SolutionTest {
    private val sol = Solution()

    @Test
    fun caseOne() {
        assertEquals(6, sol.numOfArrays(2, 3, 1))
    }

    @Test
    fun caseTwo() {
        assertEquals(0, sol.numOfArrays(5, 2, 3))
    }

    @Test
    fun caseThree() {
        assertEquals(1, sol.numOfArrays(9, 1, 1))
    }
}