package pawanroy.leetcode.`2000-reverse-prefix-of-word`

import kotlin.test.Test
import kotlin.test.assertEquals

class SolutionTest {
    private val sol = Solution()

    @Test
    fun caseOne(){
        assertEquals("dcbaefd", sol.reversePrefix("abcdefd", 'd'))
    }

    @Test
    fun caseTwo(){
        assertEquals("zxyxxe", sol.reversePrefix("xyxzxe", 'z'))
    }

    @Test
    fun caseThree(){
        assertEquals("abcd", sol.reversePrefix("abcd", 'z'))
    }
}