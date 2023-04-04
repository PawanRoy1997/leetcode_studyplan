package pawanroy.leetcode.`881-boats-to-save-people`

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SolutionTest {
    private val sol = Solution()

    @Test
    fun caseOne() {
        assertEquals(1, sol.numRescueBoats(intArrayOf(1, 2), 3))
    }

    @Test
    fun caseTwo() {
        assertEquals(3, sol.numRescueBoats(intArrayOf(3, 2, 2, 1), 3))
    }

    @Test
    fun caseThree() {
        assertEquals(4, sol.numRescueBoats(intArrayOf(3, 5, 3, 4), 5))
    }


    @Test
    fun caseFour() {
        assertEquals(2, sol.numRescueBoats(intArrayOf(5, 1, 4, 2), 6))
    }
}