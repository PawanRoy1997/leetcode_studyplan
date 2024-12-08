package pawanroy.leetcode.`2054-two-non-overlappin-max-event`

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SolutionTest {
    private val sol = Solution()

    @Test
    fun caseOne(){
        assertEquals(4, sol.maxTwoEvents(arrayOf(intArrayOf(1,3,2), intArrayOf(4,5,2), intArrayOf(2,4,3))))
    }
}