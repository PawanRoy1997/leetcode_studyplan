package pawanroy.leetcode.`2-add-two-numbers`

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

    @Test
    fun caseTwo(){

        val numberOne = ListNode(2).apply {
            next = ListNode(4).apply {
                next = ListNode(3)
            }
        }

        val numberTwo = ListNode(2).apply {
            next = ListNode(4).apply {
                next = ListNode(3)
            }
        }

        val expected = "486"

        assertEquals(expected, solution.addTwoNumbers(numberOne, numberTwo).toString())
    }

    @Test
    fun caseThree(){

        val numberOne = ListNode(2).apply {
            next = ListNode(4).apply {
                next = ListNode(3)
            }
        }

        val numberTwo = ListNode(2).apply {
            next = ListNode(6).apply {
                next = ListNode(3)
            }
        }

        val expected = "407"

        assertEquals(expected, solution.addTwoNumbers(numberOne, numberTwo).toString())
    }

    @Test
    fun caseFour(){

        val numberOne = ListNode(2).apply {
            next = ListNode(4).apply {
                next = ListNode(3)
            }
        }

        val numberTwo = ListNode(2).apply {
            next = ListNode(6)
        }

        val expected = "404"

        assertEquals(expected, solution.addTwoNumbers(numberOne, numberTwo).toString())
    }

    @Test
    fun caseFive(){

        val numberOne = ListNode(2).apply {
            next = ListNode(6)
        }
        val numberTwo = ListNode(2).apply {
            next = ListNode(4).apply {
                next = ListNode(3)
            }
        }


        val expected = "404"

        assertEquals(expected, solution.addTwoNumbers(numberOne, numberTwo).toString())
    }

    @Test
    fun caseSix(){

        val numberOne = ListNode(2).apply {
            next = ListNode(6)
        }
        val numberTwo = ListNode(2).apply {
            next = ListNode(4)
        }


        val expected = "401"

        assertEquals(expected, solution.addTwoNumbers(numberOne, numberTwo).toString())
    }
    @Test
    fun caseSeven(){

        val numberOne = ListNode(2)
        val numberTwo = ListNode(8)

        val expected = "01"

        assertEquals(expected, solution.addTwoNumbers(numberOne, numberTwo).toString())
    }
    @Test
    fun caseEight(){
        val numberOne = ListNode(2).apply {
            next = ListNode(6)
        }
        val numberTwo = ListNode(8)


        val expected = "07"

        assertEquals(expected, solution.addTwoNumbers(numberOne, numberTwo).toString())
    }
    @Test
    fun caseNine(){
        val numberOne = null
        val numberTwo = ListNode(8)


        val expected = "8"

        assertEquals(expected, solution.addTwoNumbers(numberOne, numberTwo).toString())
    }
    @Test
    fun caseTen(){
        val numberOne = ListNode(2).apply {
            next = ListNode(6)
        }
        val numberTwo = null


        val expected = "26"

        assertEquals(expected, solution.addTwoNumbers(numberOne, numberTwo).toString())
    }
}