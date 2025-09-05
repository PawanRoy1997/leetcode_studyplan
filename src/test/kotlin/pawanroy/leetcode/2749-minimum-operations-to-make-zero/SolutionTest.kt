package pawanroy.leetcode.`2749-minimum-operations-to-make-zero`

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val sol = Solution()

    @Test
    fun caseOne() {
        assertEquals(3, sol.makeTheIntegerZero(3, -2))
    }
}