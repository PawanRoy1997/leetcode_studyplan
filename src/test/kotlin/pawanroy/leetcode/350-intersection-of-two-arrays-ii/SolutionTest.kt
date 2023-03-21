package pawanroy.leetcode.`350-intersection-of-two-arrays-ii`

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class SolutionTest {
    private val sol = Solution()

    @Test
    fun caseOne() {
        assertArrayEquals(intArrayOf(2, 2), sol.intersect(intArrayOf(1, 2, 2, 1), intArrayOf(2, 2)))
    }

    @Test
    fun caseTwo() {
        assertArrayEquals(intArrayOf(), sol.intersect(intArrayOf(1, 2, 2, 1), intArrayOf(3, 4, 5, 6)))
    }

    @Test
    fun caseThree() {
        assertArrayEquals(intArrayOf(), sol.intersect(intArrayOf(), intArrayOf()))
    }

    @Test
    fun caseFour() {
        assertArrayEquals(intArrayOf(4, 9), sol.intersect(intArrayOf(4, 9, 5), intArrayOf(9, 4, 9, 8, 4)))
    }
}