package pawanroy.leetcode.`670-maximum-swap`

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SolutionTest {
    private val sol = Solution()

    @Test
    fun caseOne(): Unit {
        assertEquals(7236, sol.maximumSwap(2736))
    }

    @Test
    fun caseTwo(): Unit {
        assertEquals(9973, sol.maximumSwap(9973))
    }
}