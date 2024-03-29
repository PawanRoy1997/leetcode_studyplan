package pawanroy.leetcode.`205-isomorphic-strings`

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    @Test
    fun testCaseOne() {
        assertTrue(Solution().isIsomorphic("add", "egg"))
    }

    @Test
    fun testCaseTwo() {
        assertFalse(Solution().isIsomorphic("abcdefghijklmnopqrstuvwxyzva", "abcdefghijklmnopqrstuvwxyzck"))
    }

    @Test
    fun testCaseThree() {
        assertTrue(
            Solution().isIsomorphic(
                "aabbccddeeffgghhiijjkkllmmnnooppqqrrssttuuvvwwxxyyzzAABBCC",
                "aabbccddeeffgghhiijjkkllmmnnooppqqrrssttuuvvwwxxyyzzAABBCC"
            )
        )
    }

    @Test
    fun testCaseFour() {
        assertFalse(
            Solution().isIsomorphic(
                "aaa",
                "abc"
            )
        )
    }

    @Test
    fun testCaseFive() {
        assertFalse(
            Solution().isIsomorphic(
                "abc",
                "ddd"
            )
        )
    }
}