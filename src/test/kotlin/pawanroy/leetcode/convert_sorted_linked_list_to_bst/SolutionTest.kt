package pawanroy.leetcode.convert_sorted_linked_list_to_bst

import org.junit.jupiter.api.Test
import pawanroy.leetcode.ListNode
import kotlin.test.assertTrue

class SolutionTest{
    private val sol = Solution()
    @Test
    fun caseOne(){
        val head = ListNode(-10)
        var ptr = head
        intArrayOf(-3,0,5,9).forEach {
            ptr.next = ListNode(it)
            ptr = ptr.next!!
        }
        print(sol.sortedListToBST(head))
        assertTrue(true)
    }
    @Test
    fun caseTwo(){
        val head = ListNode(-1)
        var ptr = head
        intArrayOf(0,1,2).forEach {
            ptr.next = ListNode(it)
            ptr = ptr.next!!
        }
        print(sol.sortedListToBST(head))
        assertTrue(true)
    }
}