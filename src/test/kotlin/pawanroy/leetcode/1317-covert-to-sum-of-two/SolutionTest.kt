package pawanroy.leetcode.`1317-covert-to-sum-of-two`

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val sol = Solution()

    @Test
    fun caseOne() {
        val noZeroIntegers = sol.getNoZeroIntegers(69)
        assert(!noZeroIntegers[0].toString().contains('0'))
        assert(!noZeroIntegers[1].toString().contains('0'))
        assertEquals(69, noZeroIntegers.sum())
    }

    @Test
    fun caseTwo() {
        val noZeroIntegers = sol.getNoZeroIntegers(156)
        assert(!noZeroIntegers[0].toString().contains('0'))
        assert(!noZeroIntegers[1].toString().contains('0'))
        assertEquals(156, noZeroIntegers.sum())
    }
}