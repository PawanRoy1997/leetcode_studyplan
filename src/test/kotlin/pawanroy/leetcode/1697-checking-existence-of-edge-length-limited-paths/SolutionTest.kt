package pawanroy.leetcode.`1697-checking-existence-of-edge-length-limited-paths`

import org.junit.jupiter.api.Assertions.assertArrayEquals
import kotlin.test.Test

class SolutionTest {
    private val sol = Solution()

    @Test
    fun caseOne() {
        val queries = arrayOf(intArrayOf(0, 1, 2), intArrayOf(0, 2, 5))
        val edgeList = arrayOf(intArrayOf(0, 1, 2), intArrayOf(1, 2, 4), intArrayOf(1, 0, 16), intArrayOf(2, 0, 8))
        assertArrayEquals(
            booleanArrayOf(false, true),
            sol.distanceLimitedPathsExist(3, edgeList, queries)
        )
    }

    @Test
    fun caseTwo() {
        val edgeList = arrayOf(intArrayOf(0, 1, 10), intArrayOf(1, 2, 5), intArrayOf(2, 3, 9), intArrayOf(3, 4, 13))
        val queries = arrayOf(intArrayOf(0, 4, 14), intArrayOf(1, 4, 13))
        assertArrayEquals(
            booleanArrayOf(true, false),
            sol.distanceLimitedPathsExist(
                5,
                edgeList,
                queries
            )
        )
    }

    @Test
    fun caseThree() {
        val edgeList = arrayOf(
            intArrayOf(9, 1, 53),
            intArrayOf(3, 2, 66),
            intArrayOf(12, 5, 99),
            intArrayOf(9, 7, 26),
            intArrayOf(1, 4, 78),
            intArrayOf(11, 1, 62),
            intArrayOf(3, 10, 50),
            intArrayOf(12, 1, 71),
            intArrayOf(12, 6, 63),
            intArrayOf(1, 10, 63),
            intArrayOf(9, 10, 88),
            intArrayOf(9, 11, 59),
            intArrayOf(1, 4, 37),
            intArrayOf(4, 2, 63),
            intArrayOf(0, 2, 26),
            intArrayOf(6, 12, 98),
            intArrayOf(9, 11, 99),
            intArrayOf(4, 5, 40),
            intArrayOf(2, 8, 25),
            intArrayOf(4, 2, 35),
            intArrayOf(8, 10, 9),
            intArrayOf(11, 9, 25),
            intArrayOf(10, 11, 11),
            intArrayOf(7, 6, 89),
            intArrayOf(2, 4, 99),
            intArrayOf(10, 4, 63)
        )
        val queries = arrayOf(
            intArrayOf(9, 7, 65),
            intArrayOf(9, 6, 1),
            intArrayOf(4, 5, 34),
            intArrayOf(10, 8, 43),
            intArrayOf(3, 7, 76),
            intArrayOf(4, 2, 15),
            intArrayOf(7, 6, 52),
            intArrayOf(2, 0, 50),
            intArrayOf(7, 6, 62),
            intArrayOf(1, 0, 81),
            intArrayOf(4, 5, 35),
            intArrayOf(0, 11, 86),
            intArrayOf(12, 5, 50),
            intArrayOf(11, 2, 2),
            intArrayOf(9, 5, 6),
            intArrayOf(12, 0, 95),
            intArrayOf(10, 6, 9),
            intArrayOf(9, 4, 73),
            intArrayOf(6, 10, 48),
            intArrayOf(12, 0, 91),
            intArrayOf(9, 10, 58),
            intArrayOf(9, 8, 73),
            intArrayOf(2, 3, 44),
            intArrayOf(7, 11, 83),
            intArrayOf(5, 3, 14),
            intArrayOf(6, 2, 33)
        )
        val expected = booleanArrayOf(true,false,false,true,true,false,false,true,false,true,false,true,false,false,false,true,false,true,false,true,true,true,false,true,false,false)
        assertArrayEquals(expected, sol.distanceLimitedPathsExist(13, edgeList, queries))
    }
}