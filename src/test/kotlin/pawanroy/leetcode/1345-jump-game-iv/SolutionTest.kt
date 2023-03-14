package pawanroy.leetcode.`1345-jump-game-iv`

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val sol = Solution()

    @Test
    fun caseTwo() {
        assertEquals(1, sol.minJumps(intArrayOf(1, 1)))
        assertEquals(1, sol.minJumps(intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 1)))
    }

    @Test
    fun caseThree() {
        assertEquals(3, sol.minJumps(intArrayOf(100, -23, -23, 404, 100, 23, 23, 23, 3, 404)))
    }

    @Test
    fun caseFour() {
        assertEquals(2, sol.minJumps(intArrayOf(100, 404, -23, -23, 100, 23, 23, 23, 3, 404)))
    }

    @Test
    fun caseFive() {
        assertEquals(3, sol.minJumps(intArrayOf(7, 7, 2, 1, 7, 7, 7, 3, 4, 1)))
    }

    @Test
    fun caseSix() {
        assertEquals(5, sol.minJumps(intArrayOf(-76, 3, 66, -32, 64, 2, -19, -8, -5, -93, 80, -5, -76, -78, 64, 2, 16)))
    }

    @Test
    fun caseSeven() {
        assertEquals(3, sol.minJumps(intArrayOf(11, 22, 7, 7, 7, 7, 7, 7, 7, 22, 13)))
    }

    @Test
    fun caseEight() {
        assertEquals(
            4, sol.minJumps(
                intArrayOf(
                    51, 64, -15, 58, 98,
                    31, 48, 72, 78, -63,
                    92, -5, 64, -64, 51,
                    -48, 64, 48, -76, -86,
                    -5, -64, -86, -47, 92,
                    -41, 58, 72, 31, 78,
                    -15, -76, 72, -5, -97,
                    98, 78, -97, -41, -47,
                    -86, -97, 78, -97, 58,
                    -41, 72, -41, 72, -25,
                    -76,
                    51,
                    -86,
                    -65,
                    78,
                    -63,
                    72,
                    -15,
                    48,
                    -15,
                    -63,
                    -65,
                    31,
                    -41,
                    95,
                    51,
                    -47,
                    51,
                    -41,
                    -76,
                    58,
                    -81,
                    -41,
                    88,
                    58,
                    -81,
                    88,
                    88,
                    -47,
                    -48,
                    72,
                    -25,
                    -86,
                    -41,
                    -86,
                    -64,
                    -15,
                    -63
                )
            )
        )
    }

    @Test
    fun testCaseNine() {
        assertEquals(2, sol.minJumps(intArrayOf(2, 0, 2, 0)))
    }
}