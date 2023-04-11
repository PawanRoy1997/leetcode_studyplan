package pawanroy.leetcode.`1046-last-stone-weight`

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SolutionTest {
    private val sol = Solution()

    @Test
    fun caseOne() {
        assertEquals(1, sol.lastStoneWeight(intArrayOf(1)))
    }

    @Test
    fun caseTwo() {
        assertEquals(1, sol.lastStoneWeight(intArrayOf(2, 7, 4, 1, 8, 1)))
    }

    @Test
    fun caseThree() {
        assertEquals(2, sol.lastStoneWeight(intArrayOf(1, 3)))
    }
}