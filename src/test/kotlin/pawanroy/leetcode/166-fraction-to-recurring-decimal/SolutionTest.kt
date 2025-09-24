package pawanroy.leetcode.`166-fraction-to-recurring-decimal`

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals


class SolutionTest {
    private val sol = Solution()

    @Test
    fun noRecurring() {
        assertEquals("0.5", sol.fractionToDecimal(1,2))
    }

    @Test
    fun withoutDecimal() {
        assertEquals("2", sol.fractionToDecimal(4,2))
    }

    @Test
    fun recurring() {
        assertEquals("1.(3)", sol.fractionToDecimal(4,3))
        assertEquals("0.(012)", sol.fractionToDecimal(4,333))
    }
}