package pawanroy.leetcode.koko_eating_bananas

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val sol = Solution()

    @Test
    fun caseOne() {
        assertEquals(4, sol.minEatingSpeed(intArrayOf(3, 6, 7, 11), 8))
    }

    @Test
    fun caseTwo() {
        assertEquals(1, sol.minEatingSpeed(intArrayOf(312884470), 968709470))
    }

    @Test
    fun caseThree() {
        assertEquals(14, sol.minEatingSpeed(intArrayOf(332484035,524908576,855865114,632922376,222257295,690155293,112677673,679580077,337406589,290818316,877337160,901728858,679284947,688210097,692137887,718203285,629455728,941802184), 823855818))
    }
}