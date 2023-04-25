package pawanroy.leetcode.`2336-smallest-number-in-infinite-set`

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SmallestInfiniteSetTest {
    @Test
    fun caseOne() {
        val sol = SmallestInfiniteSet()
        sol.addBack(2)
        assertEquals(
            1,
            sol.popSmallest()
        )
        assertEquals(
            2,
            sol.popSmallest()
        )
        assertEquals(
            3,
            sol.popSmallest()
        )
        sol.addBack(1)
        sol.addBack(2)
        sol.addBack(3)
        assertEquals(
            1,
            sol.popSmallest()
        )
        assertEquals(
            2,
            sol.popSmallest()
        )
        assertEquals(
            3,
            sol.popSmallest()
        )
        assertEquals(
            4,
            sol.popSmallest()
        )
        assertEquals(
            5,
            sol.popSmallest()
        )
    }
}
