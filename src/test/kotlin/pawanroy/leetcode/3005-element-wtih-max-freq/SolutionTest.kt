package pawanroy.leetcode.`3005-element-wtih-max-freq`

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SolutionTest {
    private val sol = Solution()

    @Test
    fun caseSimple() {
        assertEquals(4, sol.maxFrequencyElements(intArrayOf(1,2,2,3,1,4)))
        assertEquals(5, sol.maxFrequencyElements(intArrayOf(1,2,3,4,5)))
    }
}