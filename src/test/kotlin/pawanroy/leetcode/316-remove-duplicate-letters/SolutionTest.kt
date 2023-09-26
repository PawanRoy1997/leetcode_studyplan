package pawanroy.leetcode.`316-remove-duplicate-letters`

import kotlin.test.Test
import kotlin.test.assertEquals

class SolutionTest {
    private val sol = Solution()
    @Test
    fun caseOne(){
        assertEquals("abc", sol.removeDuplicateLetters("bcabc"))
    }

    @Test
    fun caseTwo(){
            assertEquals("acdb", sol.removeDuplicateLetters("cbacdcbc"))
    }
}