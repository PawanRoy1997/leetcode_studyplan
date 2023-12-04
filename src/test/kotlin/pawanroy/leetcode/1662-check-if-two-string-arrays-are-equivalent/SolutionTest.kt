package pawanroy.leetcode.`1662-check-if-two-string-arrays-are-equivalent`

import kotlin.test.Test
import kotlin.test.assertTrue

class SolutionTest {
    private val sol = Solution()

    @Test
    fun caseOne() {
        assertTrue { sol.arrayStringsAreEqual(word1 = arrayOf("ab", "c"), word2 = arrayOf("a", "bc")) }
    }
}