package pawanroy.leetcode.`3254-find-the-power-of-k-size-subarray`

import org.junit.jupiter.api.Test

class SolutionTest {
    private val sol = Solution()

    @Test
    fun caseOne() {
        val expected = intArrayOf(3, 4, -1, -1, -1)
        val actual = sol.resultsArray(intArrayOf(1, 2, 3, 4, 3, 2, 5), 3)
        assertEquals(expected, actual)
    }

    @Test
    fun caseTwo(){
        assertEquals(intArrayOf(-1,-1), sol.resultsArray(intArrayOf(2,2,2,2,2), 4))
    }

    @Test
    fun caseThree(){
        assertEquals(intArrayOf(-1,3,-1,3,-1), sol.resultsArray(intArrayOf(3,2,3,2,3,2), 2))
    }

    @Test
    fun caseFour(){
        assertEquals(intArrayOf(-1,4), sol.resultsArray(intArrayOf(1,3,4), 2))
    }

    private fun assertEquals(expected: IntArray, actual: IntArray) {
        kotlin.test.assertEquals(expected.size, actual.size, "Size")
        expected.forEachIndexed { index, i ->
            kotlin.test.assertEquals(i, actual[index], "Value at index: $index")
        }
    }
}