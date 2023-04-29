package pawanroy.leetcode.`319-bulb-switcher`

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SolutionTest {
    private val sol = Solution()

    @Test
    fun caseZero() {
        assertEquals(0, sol.bulbSwitch(0))
    }

    @Test
    fun caseOne() {
        assertEquals(1, sol.bulbSwitch(1))
    }

    @Test
    fun caseTwo() {
        assertEquals(1, sol.bulbSwitch(2))
    }

    @Test
    fun caseThree() {
        assertEquals(1, sol.bulbSwitch(3))
    }
}