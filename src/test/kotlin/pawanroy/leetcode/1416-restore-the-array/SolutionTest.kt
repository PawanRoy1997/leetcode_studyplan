package pawanroy.leetcode.`1416-restore-the-array`

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SolutionTest {
    private val sol = Solution()

    @Test
    fun caseOne() {
        assertEquals(1, sol.numberOfArrays("1000", 1000))
    }

    @Test
    fun caseZero(){
        assertEquals(0, sol.numberOfArrays("10000",10))
    }
}