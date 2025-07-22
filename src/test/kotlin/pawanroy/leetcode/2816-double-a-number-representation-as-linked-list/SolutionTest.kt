package pawanroy.leetcode.`2816-double-a-number-representation-as-linked-list`

import pawanroy.leetcode.ListNode
import kotlin.test.Test
import kotlin.test.assertEquals

class SolutionTest {
    private val sol = Solution()
    @Test
    fun caseOne() {
        val head = numberToListNode(189)
        val expected = 378
        val actual = listNodeToNumber(sol.doubleIt(head)!!)
        assertEquals(expected, actual)
    }

    @Test
    fun caseTwo(){
        val head = numberToListNode(999)
        val expected = 1998
        val actual = listNodeToNumber(sol.doubleIt(head)!!)
        assertEquals(expected, actual)
    }

    private fun numberToListNode(number: Int): ListNode? {
        var head: ListNode? = null
        var n = number

        while (n > 0){
            val node = ListNode(n % 10)
            node.next = head
            head = node
            n /= 10
        }

        return head
    }

    private fun listNodeToNumber(head: ListNode): Int{
        var res = 0
        var ptr: ListNode? = head

        while(ptr != null){
            res *= 10
            res += ptr.`val`
            ptr = ptr.next
        }

        return res
    }
}