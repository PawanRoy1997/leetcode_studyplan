package pawanroy.leetcode.`1948-delete-duplicate-folders`

import kotlin.test.Test
import kotlin.test.assertEquals

class SolutionTest {
    private val sol = Solution()

    @Test
    fun caseOne(){
        assertEquals(listOf(listOf("d"),listOf("d","a")),sol.deleteDuplicateFolder(listOf(listOf("a"),listOf("c"),listOf("d"),listOf("a","b"),listOf("c","b"),listOf("d","a"))))
    }
}