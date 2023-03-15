package pawanroy.leetcode.`6-zigzag-conversion`

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SolutionTest {
    private val sol = Solution()

    @Test
    fun caseOne() {
        assertEquals("PAHNAPLSIIGYIR", sol.convert("PAYPALISHIRING", 3))
    }

    @Test
    fun caseTwo() {
        assertEquals("PINALSIGYAHRPI", sol.convert("PAYPALISHIRING", 4))
    }

    @Test
    fun caseThree() {
        assertEquals("ABDC", sol.convert("ABCD", 3))
    }
}