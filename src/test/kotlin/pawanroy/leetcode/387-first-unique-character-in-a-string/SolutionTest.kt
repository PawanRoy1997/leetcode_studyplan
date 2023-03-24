package pawanroy.leetcode.`387-first-unique-character-in-a-string`

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SolutionTest {
    private val sol = Solution()

    @Test
    fun caseOne() {
        assertEquals(0, sol.firstUniqChar("leetcode"))
    }

    @Test
    fun caseTwo() {
        assertEquals(-1, sol.firstUniqChar("ee"))
    }
}