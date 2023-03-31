package pawanroy.leetcode.`1444-number-of-ways-of-cutting-a-pizza`

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SolutionTest {
    private val sol = Solution()

    @Test
    fun caseOne() {
        assertEquals(3, sol.ways(arrayOf("A..", "AAA", "..."), 3))
    }
}