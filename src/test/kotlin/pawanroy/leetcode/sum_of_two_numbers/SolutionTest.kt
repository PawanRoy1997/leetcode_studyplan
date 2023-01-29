package pawanroy.leetcode.sum_of_two_numbers

import pawanroy.leetcode.ListNode
import kotlin.test.Test
import kotlin.test.assertEquals

class SolutionTest {
    val solution = Solution()

    @Test
    fun caseOne() {
        val numberOne = ListNode(2).apply {
            next = ListNode(4).apply {
                next = ListNode(3)
            }
        }

        val numberTwo = ListNode(5).apply {
            next = ListNode(6).apply {
                next = ListNode(4)
            }
        }

        val expected = "708"

        assertEquals(expected, solution.addTwoNumbers(numberOne, numberTwo).toString())
    }
}