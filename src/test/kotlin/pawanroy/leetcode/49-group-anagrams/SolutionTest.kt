package pawanroy.leetcode.`49-group-anagrams`

import kotlin.test.Test
import kotlin.test.assertEquals

class SolutionTest {
    private val sol = Solution()

    @Test
    fun caseOne() {
        val actual = sol.groupAnagrams(arrayOf("eat", "tea", "tan", "ate", "nat", "bat"))
        val expected = listOf(listOf("eat", "tea", "ate"), listOf("tan", "nat"), listOf("bat"))
        assertEquals(expected.size, actual.size)
        for(i in expected.indices){
            assertEquals(expected[i].size, actual[i].size)
            for(j in expected[i].indices){
                assertEquals(expected[i][j], actual[i][j])
            }
        }
    }
}