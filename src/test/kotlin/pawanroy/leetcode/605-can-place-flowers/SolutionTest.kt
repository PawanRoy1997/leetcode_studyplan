package pawanroy.leetcode.`605-can-place-flowers`

import org.junit.jupiter.api.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class SolutionTest {
    private val sol = Solution()

    @Test
    fun caseOne() {
        assertTrue(sol.canPlaceFlowers(intArrayOf(1, 0, 0, 0, 1), 1))
    }

    @Test
    fun caseTwo() {
        assertFalse(sol.canPlaceFlowers(intArrayOf(1, 0, 0, 1), 1))
        assertTrue(sol.canPlaceFlowers(intArrayOf(1, 0, 0, 0, 0, 1), 1))
        assertFalse(sol.canPlaceFlowers(intArrayOf(1, 0, 0, 0, 0, 1), 2))
        assertTrue(sol.canPlaceFlowers(intArrayOf(1, 0, 0, 0), 1))
    }

    @Test
    fun caseFirstIsEmpty() {
        assertTrue(sol.canPlaceFlowers(intArrayOf(0,0,1,0,1), 1))
    }

    @Test
    fun caseLastIsEmpty() {
        assertTrue(sol.canPlaceFlowers(intArrayOf(0,0,1,0,1), 1))
    }
}