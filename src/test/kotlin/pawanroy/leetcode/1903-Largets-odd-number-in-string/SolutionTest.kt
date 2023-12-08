package pawanroy.leetcode.`1903-Largets-odd-number-in-string`

import kotlin.test.Test
import kotlin.test.assertEquals

class SolutionTest {
    private val sol = Solution()
    @Test
    fun caseOne(){
        assertEquals("5", sol.largestOddNumber("52"))
    }

    @Test
    fun caseTwo(){
        assertEquals("", sol.largestOddNumber("20468"))
    }

    @Test
    fun caseThree(){
        assertEquals("35427", sol.largestOddNumber("35427"))
        assertEquals("25427", sol.largestOddNumber("25427"))
        assertEquals("25", sol.largestOddNumber("25422"))
    }
}