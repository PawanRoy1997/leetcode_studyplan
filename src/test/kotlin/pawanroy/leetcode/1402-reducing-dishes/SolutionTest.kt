package pawanroy.leetcode.`1402-reducing-dishes`

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SolutionTest {
    private val sol = Solution()

    @Test
    fun caseOne() {
        assertEquals(14, sol.maxSatisfaction(intArrayOf(-1, -8, 0, 5, -9)))
    }
}