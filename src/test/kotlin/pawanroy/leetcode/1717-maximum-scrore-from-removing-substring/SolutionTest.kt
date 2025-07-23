package pawanroy.leetcode.`1717-maximum-scrore-from-removing-substring`

import kotlin.test.Test
import kotlin.test.assertEquals

class SolutionTest {
    private val sol = Solution()

    @Test
    fun caseOne(){
        assertEquals(20, sol.maximumGain("aabbaaxybbaabb", 4,5))
        assertEquals(19, sol.maximumGain("cdbcbbaaabab", 4,5))
    }
}