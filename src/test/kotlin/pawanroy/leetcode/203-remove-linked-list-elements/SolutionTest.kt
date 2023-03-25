package pawanroy.leetcode.`203-remove-linked-list-elements`

import org.junit.jupiter.api.Test
import pawanroy.leetcode.ListNode
import kotlin.test.assertEquals

class SolutionTest {
    private val sol = Solution()

    @Test
    fun caseOne() {
        val list = ListNode(1).also {
            it.next = ListNode(2).also {
                it.next = ListNode(3).also {
                    it.next = ListNode(4).also { it.next = ListNode(5).also { it.next = ListNode(6) } }
                }
            }
        }
        println(list.toString())
        assertEquals(list, sol.removeElements(list, 6))
        println(list.toString())
    }
}