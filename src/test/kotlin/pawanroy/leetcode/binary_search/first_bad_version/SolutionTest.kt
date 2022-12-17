package pawanroy.leetcode.binary_search.first_bad_version

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SolutionTest {
    @Test
    fun testCaseOne() {
        val actual = Solution()
        actual.badVersion = 8
        assertEquals(actual.badVersion, actual.firstBadVersion(8))
    }

    @Test
    fun testCaseTwo() {
        val actual = Solution()
        actual.badVersion = 1
        assertEquals(actual.badVersion, actual.firstBadVersion(8))
    }

    @Test
    fun testCaseOneNumber() {
        val actual = Solution()
        actual.badVersion = 1
//        assertTrue { (actual.badVersion - 1..actual.badVersion + 1).contains(actual.firstBadVersion(1)) }
        assertEquals(actual.badVersion, actual.firstBadVersion(1))
    }

    @Test
    fun testCaseRandom() {
        val actual = Solution()
        actual.badVersion = kotlin.random.Random.nextInt(1, 30)
        assertEquals(actual.badVersion, actual.firstBadVersion(30))
//        assertTrue { (actual.badVersion - 1..actual.badVersion + 1).contains(actual.firstBadVersion(30)) }
    }

    @Test
    fun testCaseSmallRange() {
        val actual = Solution()
        actual.badVersion = 1
        assertEquals(1, actual.firstBadVersion(2))
    }

    @Test
    fun testCaseSmallRange2() {
        val actual = Solution()
        actual.badVersion = 2
        assertEquals(2, actual.firstBadVersion(2))
    }
}