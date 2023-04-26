package pawanroy.leetcode.`258-add-digits`

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SolutionTest {
    private val sol = Solution()

    @Test
    fun caseOne() {
        assertEquals(2, sol.addDigits(38))
    }

    @Test
    fun caseTwo() {
        assertEquals(8, sol.addDigits(44))
    }
}