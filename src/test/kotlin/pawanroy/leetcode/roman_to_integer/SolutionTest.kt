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

    @Test
    fun complete(){
        assertEquals(334,solution.romanToInt("IVXLCDM"))
    }

    @Test
    fun completeInverse(){
        assertEquals(1666,solution.romanToInt("MDCLXVI"))
    }

    @Test
    fun illegal(){
        assertEquals(0,solution.romanToInt("Z"))
    }
}