package pawanroy.leetcode.`846-hand-of-straights`

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SolutionTest {
    private val sol = Solution()

    @Test
    fun caseOne() {
        assertEquals(true, sol.isNStraightHand(intArrayOf(1,2,3,6,2,3,4,7,8), 3))
    }

    @Test
    fun caseTwo() {
        assertEquals(false, sol.isNStraightHand(intArrayOf(1,2,3,4,5), 3))
    }

    @Test
    fun caseThree() {
        assertEquals(false, sol.isNStraightHand(intArrayOf(8,10,12), 3))
    }
}