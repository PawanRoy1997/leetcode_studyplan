package pawanroy.leetcode.`2264-largets-3-same-digit-number-in-string`

import kotlin.test.Test
import kotlin.test.assertEquals

class SolutionTest {
    private val sol = Solution()

    @Test
    fun caseOne(){
        assertEquals("777",sol.largestGoodInteger("6777133339"))
    }
}