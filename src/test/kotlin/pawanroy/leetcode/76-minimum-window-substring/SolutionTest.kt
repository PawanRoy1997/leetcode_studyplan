package pawanroy.leetcode.`76-minimum-window-substring`

import kotlin.test.Test
import kotlin.test.assertEquals

class SolutionTest {
    private val sol = Solution()

    @Test
    fun caseOne(){
        assertEquals("BANC", sol.minWindow("ADOBECODEBANC", "ABC"))
    }
}