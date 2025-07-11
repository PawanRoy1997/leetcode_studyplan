package pawanroy.leetcode.`2402-meeting-rooms`

import kotlin.test.Test
import kotlin.test.assertEquals

class SolutionTest {
    private val sol = Solution()

    @Test
    fun caseOne() {
        assertEquals(
            0,
            sol.mostBooked(2, arrayOf(intArrayOf(0, 10), intArrayOf(1, 5), intArrayOf(2, 7), intArrayOf(3, 4)))
        )
        assertEquals(
            1,
            sol.mostBooked(
                3,
                arrayOf(intArrayOf(1, 20), intArrayOf(2, 10), intArrayOf(3, 5), intArrayOf(4, 9), intArrayOf(6, 8))
            )
        )
    }

    @Test
    fun caseTwo() {
        assertEquals(
            0,
            sol.mostBooked(
                4,
                arrayOf(intArrayOf(18, 19), intArrayOf(3, 12), intArrayOf(17, 19), intArrayOf(2, 13), intArrayOf(7, 10))
            )
        )
        assertEquals(
            0,
            sol.mostBooked(
                4,
                arrayOf(
                    intArrayOf(48, 49),
                    intArrayOf(22, 30),
                    intArrayOf(13, 31),
                    intArrayOf(31, 46),
                    intArrayOf(37, 46),
                    intArrayOf(32, 36),
                    intArrayOf(25, 36),
                    intArrayOf(49, 50),
                    intArrayOf(24, 34),
                    intArrayOf(6, 41)
                )
            )
        )
    }
}