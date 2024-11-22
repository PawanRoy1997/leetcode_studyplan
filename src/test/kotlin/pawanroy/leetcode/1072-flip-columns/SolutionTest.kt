package pawanroy.leetcode.`1072-flip-columns`

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SolutionTest {
    private val sol = Solution()

    @Test
    fun caseOne() {
        assertEquals(
            2, sol.maxEqualRowsAfterFlips(
                arrayOf(
                    intArrayOf(1, 0, 0, 0, 1, 1, 1, 0, 1, 1, 1),
                    intArrayOf(1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0),
                    intArrayOf(1, 0, 0, 0, 1, 1, 1, 0, 1, 1, 1),
                    intArrayOf(1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0),
                    intArrayOf(1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1)
                )
            )
        )
    }

}