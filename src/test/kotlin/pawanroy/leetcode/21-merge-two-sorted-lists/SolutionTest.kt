package pawanroy.leetcode.`21-merge-two-sorted-lists`

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import pawanroy.leetcode.ListNode

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

    @Test
    fun testCaseFive(){
        val list2 = ListNode(2)
        val mergedTwoList = Solution().mergeTwoLists(null, list2)
        assertEquals(list2, mergedTwoList)
    }

    @Test
    fun testCaseSix() {
        val list1 = ListNode(2)
        val list2 = ListNode(1)
        val mergeTwoLists = Solution().mergeTwoLists(list1, list2)
        assertEquals(list2, mergeTwoLists)
    }
}