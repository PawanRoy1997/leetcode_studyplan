package pawanroy.leetcode.`3136-string-compression`

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SolutionTest {
    private val sol = Solution()

    @Test
    fun caseOne() {
        assertEquals("1a1b1c1d1e",sol.compressedString("abcde"))
    }

    @Test
    fun caseTwo(): Unit {
        assertEquals("9a5a2b",sol.compressedString("aaaaaaaaaaaaaabb"))
    }
}