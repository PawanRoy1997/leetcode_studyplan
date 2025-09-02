package pawanroy.leetcode.`3025-number-of-ways-to-place-people`

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SolutionTest {
    private val sol = Solution()

    @Test
    fun caseOne() {
        assertEquals(0, sol.numberOfPairs(arrayOf(intArrayOf(1, 1), intArrayOf(2, 2), intArrayOf(3, 3))))
    }

    @Test
    fun caseTwo() {
        assertEquals(2, sol.numberOfPairs(arrayOf(intArrayOf(6, 2), intArrayOf(4, 4), intArrayOf(2, 6))))
    }
}