package pawanroy.leetcode.`1497-check-if-array-pairs-are-divisible-by-k`

import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Test
import kotlin.test.assertTrue

class SolutionTest {
    private val sol = Solution()

    @Test
    fun caseOne() {
        assertTrue(sol.canArrange(intArrayOf(5, 10), 5))
        assertTrue(sol.canArrange(intArrayOf(1, 2, 3, 4, 5, 10, 6, 7, 8, 9), 5))
        assertFalse(sol.canArrange(intArrayOf(5, 5, 1, 2, 3, 4), 10))
    }

    @Test
    fun caseTwo(){
        assertTrue(sol.canArrange(intArrayOf(-4,-7,5,2,9,1,10,4,-8,-3), 3))
    }

    @Test
    fun caseThree(){
        assertFalse(sol.canArrange(intArrayOf(-1,-1,-1,-1,2,2,-2,-2), 3))
    }
}