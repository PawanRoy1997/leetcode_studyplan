package pawanroy.leetcode.`438-find-all-anagrams-in-a-string`

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SolutionTest {
    private val sol = Solution()

    @Test
    fun caseOne() {
        assertEquals(listOf(0, 6), sol.findAnagrams("cbaebabacd", "abc"))
    }
}