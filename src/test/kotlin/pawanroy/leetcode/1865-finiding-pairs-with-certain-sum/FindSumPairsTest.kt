package pawanroy.leetcode.`1865-finiding-pairs-with-certain-sum`

import kotlin.test.Test
import kotlin.test.assertEquals

class FindSumPairsTest {
    @Test
    fun caseOne() {
        val sol = FindSumPairs(intArrayOf(1, 1, 2, 2, 2, 3), intArrayOf(1, 4, 5, 2, 5, 4))
        assertEquals(8,sol.count(7))
        sol.add(3,2)
        assertEquals(2,sol.count(8))
        assertEquals(1,sol.count(4))
        sol.add(0,1)
        sol.add(1,1)
        assertEquals(11,sol.count(7))
    }
}