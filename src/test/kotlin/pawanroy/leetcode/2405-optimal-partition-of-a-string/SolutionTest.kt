package pawanroy.leetcode.`2405-optimal-partition-of-a-string`

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SolutionTest {
    private val sol = Solution()

    @Test
    fun caseOne() {
        assertEquals(4, sol.partitionString("abacaba"))
    }

    @Test
    fun caseTwo() {
        assertEquals(6, sol.partitionString("ssssss"))
    }
}