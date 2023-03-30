package pawanroy.leetcode.`299-bulls-and-cows`

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SolutionTest {
    private val sol = Solution()

    @Test
    fun caseOne() {
        assertEquals("1A3B", sol.getHint("1807", "7810"))
    }

    @Test
    fun caseTwo() {
        assertEquals("1A1B", sol.getHint("1123", "0111"))
    }

    @Test
    fun caseThree() {
        assertEquals("1A0B", sol.getHint("11", "01"))
    }
}