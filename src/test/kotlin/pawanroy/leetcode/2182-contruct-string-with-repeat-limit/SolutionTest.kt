package pawanroy.leetcode.`2182-contruct-string-with-repeat-limit`

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SolutionTest {
    private val sol = Solution()

    @Test
    fun caseOne(){
        assertEquals("zzcccac", sol.repeatLimitedString(s = "cczazcc", repeatLimit = 3), "Case zzcccac")
    }
}