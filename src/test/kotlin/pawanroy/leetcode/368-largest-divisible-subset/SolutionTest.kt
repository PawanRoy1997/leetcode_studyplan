package pawanroy.leetcode.`368-largest-divisible-subset`

import kotlin.test.Test
import kotlin.test.assertEquals

class SolutionTest {
    private val sol = Solution()

    @Test
    fun caseOne() {
        assertListEquals(listOf(1, 3), sol.largestDivisibleSubset(intArrayOf(1, 2, 3)))
    }

    private fun assertListEquals(expected: List<Int>, actual: List<Int>) {
        println("Expected:")
        expected.forEach(::println)
        println("Actual")
        actual.forEach(::println)
        assertEquals(expected.size, actual.size)
    }

    @Test
    fun caseTwo() {
        assertListEquals(listOf(1,2,4,8), sol.largestDivisibleSubset(intArrayOf(1, 2, 4, 8)))
    }

    @Test
    fun caseThree() {
        assertListEquals(listOf(4,8,240), sol.largestDivisibleSubset(intArrayOf(4, 8, 10, 240)))
    }

    @Test
    fun caseFour(){
        assertListEquals(listOf(9,18,90,180,360,720), sol.largestDivisibleSubset(intArrayOf(5,9,18,54,108,540,90,180,360,720)))
    }
}