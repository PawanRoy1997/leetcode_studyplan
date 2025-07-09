package pawanroy.leetcode.`65-valid-number`

import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class SolutionTest {
    private val sol = Solution()

    @Test
    fun caseInteger(): Unit {
        assertTrue { sol.isNumber("0") }
        assertTrue { sol.isNumber("+1") }
        assertTrue { sol.isNumber("-1") }
    }

    @Test
    fun caseDecimal(): Unit {
        assertTrue { sol.isNumber("0.1") }
        assertTrue { sol.isNumber("+1.1") }
        assertTrue { sol.isNumber("-1.1") }
    }

    @Test
    fun sampleCases(): Unit {
        assertTrue { sol.isNumber("2") }
        assertTrue { sol.isNumber("0089") }
        assertTrue { sol.isNumber("-0.1") }
        assertTrue { sol.isNumber("+3.14") }
        assertTrue { sol.isNumber("4.") }
        assertTrue { sol.isNumber("-.9") }
        assertTrue { sol.isNumber("2e10") }
        assertTrue { sol.isNumber("-90E3") }
        assertTrue { sol.isNumber("3e+7") }
        assertTrue { sol.isNumber("+6e-1") }
        assertTrue { sol.isNumber("53.5e93") }
        assertTrue { sol.isNumber("-123.456e789") }
    }

    @Test
    fun failureCases(): Unit {
        assertFalse{ sol.isNumber("abc") }
        assertFalse{ sol.isNumber("1a") }
        assertFalse{ sol.isNumber("1e") }
        assertFalse{ sol.isNumber("e3") }
        assertFalse{ sol.isNumber("99e2.5") }
        assertFalse{ sol.isNumber("--6") }
        assertFalse{ sol.isNumber("-+3") }
        assertFalse{ sol.isNumber("95a54e53") }
        assertFalse { sol.isNumber("7e69e") }
    }
}