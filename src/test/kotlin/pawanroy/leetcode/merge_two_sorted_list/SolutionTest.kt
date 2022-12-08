package pawanroy.leetcode.merge_two_sorted_list

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    @Test
    fun testCaseOne() {
        val mergeTwoLists = Solution().mergeTwoLists(null, null)
        assertNull(mergeTwoLists)
    }

    @Test
    fun testCaseTwo() {
        val list1 = ListNode(1)
        val mergeTwoLists = Solution().mergeTwoLists(list1, null)
        assertEquals(list1, mergeTwoLists)
    }

    @Test
    fun testCaseThree() {
        val list1 = ListNode(1)
        val list2 = ListNode(2)
        val mergeTwoLists = Solution().mergeTwoLists(list1, list2)
        assertEquals(list1, mergeTwoLists)
    }

    @Test
    fun testCaseFour() {
        val list1 = ListNode(1)
        val mergeTwoLists = Solution().mergeTwoLists(null, list1)
        assertEquals(list1, mergeTwoLists)
    }
}