package pawanroy.leetcode.`733-flood-fill`

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import java.util.*

class SolutionTest {
    private val input = arrayOf(
        intArrayOf(1, 1, 1),
        intArrayOf(1, 1, 2),
        intArrayOf(1, 0, 1)
    )
    private val expected = arrayOf(
        intArrayOf(2, 2, 2),
        intArrayOf(2, 2, 2),
        intArrayOf(2, 0, 1)
    )

    @Test
    fun testCaseOne() {
        val output = Solution().floodFill(input, 1, 1, 2)
        expected.forEachIndexed{
            index,array ->
            assertTrue(Arrays.equals(array, output[index]))
        }
    }

    @Test
    fun testCaseTwo() {
        val output = Solution().floodFill(input, 1, 1, 1)
        input.forEachIndexed{
            index,array ->
            assertTrue(array.contentEquals(output[index]))
        }
    }
}