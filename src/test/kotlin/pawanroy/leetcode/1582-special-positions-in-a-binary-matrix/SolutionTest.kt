package pawanroy.leetcode.`1582-special-positions-in-a-binary-matrix`

import kotlin.test.Test
import kotlin.test.assertEquals

class SolutionTest {
    private val sol = Solution()

    @Test
    fun caseOne() {
        val input = arrayOf(intArrayOf(1, 0, 0), intArrayOf(0, 0, 1), intArrayOf(1, 0, 0))
        assertEquals(1, sol.numSpecial(input))
    }

    @Test
    fun caseTwo() {
        val input = arrayOf(intArrayOf(1, 0, 0), intArrayOf(0, 1, 0), intArrayOf(0, 0, 1))
        assertEquals(3, sol.numSpecial(input))
    }

    @Test
    fun caseThree(){
        val input = arrayOf(
            intArrayOf(0,0,0,0,0,1,0,0),
            intArrayOf(0,0,0,0,1,0,0,1),
            intArrayOf(0,0,0,0,1,0,0,0),
            intArrayOf(1,0,0,0,1,0,0,0),
            intArrayOf(0,0,1,1,0,0,0,0))
        assertEquals(1, sol.numSpecial(input))
    }
}