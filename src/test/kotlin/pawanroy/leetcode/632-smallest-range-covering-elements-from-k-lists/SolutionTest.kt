package pawanroy.leetcode.`632-smallest-range-covering-elements-from-k-lists`

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SolutionTest {
    private val sol = Solution()

    @Test
    fun caseOne() {
        val res = sol.smallestRange(
            listOf(
                listOf(4, 10, 15, 24, 26),
                listOf(0, 9, 12, 20),
                listOf(5, 18, 22, 30)
            )
        )
        assertEquals(20, res.first())
        assertEquals(24, res.last())
    }


    @Test
    fun caseTwo() {
        val res = sol.smallestRange(
            listOf(
                listOf(1), listOf(2), listOf(3), listOf(4), listOf(5), listOf(6), listOf(7)
            )
        )
        assertEquals(1, res.first())
        assertEquals(7, res.last())
    }
}