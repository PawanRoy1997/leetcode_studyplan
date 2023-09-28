package pawanroy.leetcode.`905-sort-array-by-parity`

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Assertions.assertTrue
import kotlin.test.Test

class SolutionTest {
    private val sol = Solution()

    @Test
    fun caseOne(){
        assertArrayEquals(intArrayOf(0), sol.sortArrayByParity(intArrayOf(0)))
        assertArrayEquals(intArrayOf(1), sol.sortArrayByParity(intArrayOf(1)))
    }

    @Test
    fun caseTwo(){
        assertArrayEquals(intArrayOf(2,1), sol.sortArrayByParity(intArrayOf(1,2)))
    }
    @Test
    fun caseThree() {
        var result = false

        val actual = sol.sortArrayByParity(intArrayOf(1, 2, 3, 4))

        val validResults = arrayOf(
            intArrayOf(2, 4, 3, 1),
            intArrayOf(4, 2, 3, 1),
            intArrayOf(4, 2, 1, 3),
            intArrayOf(2, 4, 1, 3),
        )

        validResults.forEach { r ->
            var tmpRes = false
            r.forEachIndexed{ index, number ->
                tmpRes = actual[index] == number
            }
            result = result || tmpRes
        }
        assertTrue(result)
    }
}