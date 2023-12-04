package pawanroy.leetcode.`1160-find-words-that-can-be-formed-by-characters`

import kotlin.test.Test
import kotlin.test.assertEquals

class SolutionTest {
    private val sol = Solution()

    @Test
    fun caseOne(){
        assertEquals(6, sol.countCharacters(words = arrayOf("cat","bt","hat","tree"), chars = "atach"))
    }
}