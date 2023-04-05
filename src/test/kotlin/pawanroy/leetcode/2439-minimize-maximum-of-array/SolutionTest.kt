package pawanroy.leetcode.`2439-minimize-maximum-of-array`

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SolutionTest {
    private val sol = Solution()

    @Test
    fun caseOne() {
        assertEquals(5, sol.minimizeArrayValue(intArrayOf(3, 7, 1, 6)))
    }

    @Test
    fun caseTwo() {
        assertEquals(10, sol.minimizeArrayValue(intArrayOf(10, 1)))
    }

    @Test
    fun caseThree() {
        assertEquals(
            542,
            sol.minimizeArrayValue(
                intArrayOf(
                    97,
                    777,
                    495,
                    796,
                    192,
                    606,
                    6,
                    667,
                    792,
                    119,
                    275,
                    241,
                    277,
                    404,
                    983,
                    775,
                    206,
                    147,
                    422,
                    377,
                    422,
                    370,
                    427,
                    881,
                    29,
                    39,
                    760,
                    173,
                    68,
                    972,
                    231,
                    92,
                    945,
                    42,
                    745,
                    821,
                    697,
                    95,
                    634,
                    596,
                    544,
                    780,
                    167,
                    329,
                    811,
                    908,
                    764,
                    536,
                    633,
                    270,
                    48,
                    540,
                    323,
                    743,
                    844,
                    92,
                    423,
                    176,
                    693,
                    785,
                    535,
                    569,
                    810,
                    360,
                    128,
                    794,
                    53,
                    703,
                    549
                )
            )
        )
    }
}