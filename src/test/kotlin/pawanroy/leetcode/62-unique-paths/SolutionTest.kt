package pawanroy.leetcode.`62-unique-paths`

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SolutionTest {
    private val sol = Solution()

    @Test
    fun caseOne() {
        assertEquals(28, sol.uniquePaths(3, 7))
    }

    @Test
    fun caseTwo() {
        assertEquals(3, sol.uniquePaths(3, 2))
    }
}