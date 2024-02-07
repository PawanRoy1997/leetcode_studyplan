package pawanroy.leetcode.`451-sort-characters-by-frequency`

import kotlin.test.Test
import kotlin.test.assertEquals

class SolutionTest {
    private val sol = Solution()

    @Test
    fun caseOne(){
        assertEquals("eert", sol.frequencySort("tree"))
    }

    @Test
    fun caseTwo(){
        assertEquals("aaaccc", sol.frequencySort("cccaaa"))
    }
}