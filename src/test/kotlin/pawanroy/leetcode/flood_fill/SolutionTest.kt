package pawanroy.leetcode.flood_fill

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import java.util.*

class SolutionTest {
    @Test
    fun testCaseOne() {
        val input = arrayOf(
            intArrayOf(1, 1, 1),
            intArrayOf(1, 1, 0),
            intArrayOf(1, 0, 1)
        )
        val expected = arrayOf(
            intArrayOf(2, 2, 2),
            intArrayOf(2, 2, 0),
            intArrayOf(2, 0, 1)
        )

        val output = Solution().floodFill(input, 1, 1, 2)
        expected.forEachIndexed{
            index,array ->
            assertTrue(Arrays.equals(array, output[index]))
        }
    }
}