package pawanroy.leetcode.`1466-reorder-routes-to-make-all-path-leads-to-the-city-zero`

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SolutionTest {
    private val sol = Solution()

    @Test
    fun caseOne() {
        val connections =
            arrayOf(intArrayOf(0, 1), intArrayOf(1, 3), intArrayOf(2, 3), intArrayOf(4, 0), intArrayOf(4, 5))
        assertEquals(3, sol.minReorder(6, connections), "Leetcode:case#1 ")
    }
}