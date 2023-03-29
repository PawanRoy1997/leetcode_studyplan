package pawanroy.leetcode.`424-longest-repeating-character-replacement`

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SolutionTest {
    private val sol = Solution()

    @Test
    fun caseOne() {
        assertEquals(4, sol.characterReplacement("ABAB", 2))
    }

    @Test
    fun caseTwo() {
        assertEquals(4, sol.characterReplacement("AABABBA", 1))
    }
}