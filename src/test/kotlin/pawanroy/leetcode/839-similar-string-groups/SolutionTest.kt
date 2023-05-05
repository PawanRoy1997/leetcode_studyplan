package pawanroy.leetcode.`839-similar-string-groups`

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SolutionTest {
    private val sol = Solution()

    @Test
    fun caseOne() {
        assertEquals(2, sol.numSimilarGroups(arrayOf("tars", "rats", "arts", "star")))
    }

    @Test
    fun caseTwo() {
        assertEquals(1, sol.numSimilarGroups(arrayOf("omv", "ovm")))
    }
}