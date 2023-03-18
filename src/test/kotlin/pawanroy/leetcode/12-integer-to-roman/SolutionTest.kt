package pawanroy.leetcode.`12-integer-to-roman`

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.random.Random
import pawanroy.leetcode.`13-roman-to-integer`.Solution as RomanToInt

class SolutionTest {
    private val sol= Solution()
    private val converter = RomanToInt()

    @Test
    fun caseLessThan10() {
        assertEquals("I", sol.intToRoman(1))
        assertEquals("V", sol.intToRoman(5))
        assertEquals("IX", sol.intToRoman(9))
        assertEquals("IV", sol.intToRoman(4))
        assertEquals("III", sol.intToRoman(3))
        assertEquals("VIII", sol.intToRoman(8))
    }

    @Test
    fun caseRandom() {
        val expectedValue = Random.nextInt(1,3000)
        val actualValue = converter.romanToInt(sol.intToRoman(expectedValue))
        assertEquals(expectedValue, actualValue)
    }
}