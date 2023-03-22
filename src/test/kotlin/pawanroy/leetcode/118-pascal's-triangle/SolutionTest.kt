package pawanroy.leetcode.`118-pascal's-triangle`

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class SolutionTest {
    private val sol = Solution()

    @Test
    fun caseOne() {
        assertArrayEquals(
            arrayOf(
                listOf(1),
                listOf(1, 1),
                listOf(1, 2, 1),
                listOf(1, 3, 3, 1)
            ),
            sol.generate(4).toTypedArray()
        )
    }
}