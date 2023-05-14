package pawanroy.leetcode.`66-plus-one`

import org.junit.jupiter.api.Test
import kotlin.test.assertContentEquals

class SolutionTest {
    private val sol = Solution()

    @Test
    fun case0() {
        assertContentEquals(intArrayOf(1), sol.plusOne(intArrayOf()))
    }

    @Test
    fun case1() {
        assertContentEquals(intArrayOf(2), sol.plusOne(intArrayOf(1)))
    }

    @Test
    fun case9() {
        assertContentEquals(intArrayOf(1, 0), sol.plusOne(intArrayOf(9)))
    }
}