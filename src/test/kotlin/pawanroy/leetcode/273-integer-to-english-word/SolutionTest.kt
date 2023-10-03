package pawanroy.leetcode.`273-integer-to-english-word`

import kotlin.test.Test
import kotlin.test.assertEquals

class SolutionTest {
    private val sol = Solution()
    @Test
    fun caseOne(){
        assertEquals("One Hundred Twenty Three", sol.numberToWords(123))
    }

    @Test
    fun caseTwo(){
        assertEquals("Twelve Thousand Three Hundred Forty Five", sol.numberToWords(12345))
    }

    @Test
    fun caseThree(){
        assertEquals("One Million Two Hundred Thirty Four Thousand Five Hundred Sixty Seven", sol.numberToWords(1234567))
    }
}