package pawanroy.leetcode.`879-profitable-scheme`

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SolutionTest {
    private val sol = Solution()

    @Test
    fun caseOne() {
        assertEquals(2, sol.profitableSchemes(5, 3, intArrayOf(2, 2), intArrayOf(2, 3)))
    }

    @Test
    fun caseTwo() {
        assertEquals(7, sol.profitableSchemes(10, 5, intArrayOf(2, 3, 5), intArrayOf(6, 7, 8)))
    }
}