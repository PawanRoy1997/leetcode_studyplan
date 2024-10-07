package pawanroy.leetcode.`2696-minimum-length-of-string-after-removing-substring`

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SolutionTest {
    private val sol = Solution()

    @Test
    fun caseOne(){
        assertEquals(2, sol.minLength("ABFCACDB"))
    }
}