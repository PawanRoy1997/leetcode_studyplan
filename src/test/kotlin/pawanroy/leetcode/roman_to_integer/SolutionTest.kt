package pawanroy.leetcode.roman_to_integer

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SolutionTest {
    private val solution = Solution()

    @Test
    fun caseAllSame() {
        assertEquals(3, solution.romanToInt("III"))
    }

    @Test
    fun justI() {
        assertEquals(1, solution.romanToInt("I"))
    }

    @Test
    fun justIV() {
        assertEquals(4, solution.romanToInt("IV"))
    }

    @Test
    fun complex(){
        assertEquals(58, solution.romanToInt("LVIII"))
    }
}