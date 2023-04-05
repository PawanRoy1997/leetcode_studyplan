package pawanroy.leetcode.`58-length-of-last-word`

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SolutionTest {
    private val sol = Solution()

    @Test
    fun caseOne() {
        assertEquals(5, sol.lengthOfLastWord("Hello World"))
    }

    @Test
    fun caseTwo() {
        assertEquals(4, sol.lengthOfLastWord("   fly me   to   the moon  "))
    }
}