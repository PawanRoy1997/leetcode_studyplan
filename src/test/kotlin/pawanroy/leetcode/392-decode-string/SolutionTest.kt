package pawanroy.leetcode.`392-decode-string`

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SolutionTest {
    private val sol = Solution()

    @Test
    fun caseOne() {
        assertEquals("aaabcbc", sol.decodeString("3[a]2[bc]"))
    }

    @Test
    fun caseTwo() {
        assertEquals("accaccacc", sol.decodeString("3[a2[c]]"))
    }
}