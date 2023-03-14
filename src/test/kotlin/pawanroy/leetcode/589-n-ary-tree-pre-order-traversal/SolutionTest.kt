package pawanroy.leetcode.`589-n-ary-tree-pre-order-traversal`

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import pawanroy.leetcode.Node

class SolutionTest{
    @Test
    fun testCaseOne(){
        val node5 = Node(5)
        val node6 = Node(6)
        val node3 = Node(3)
        val node2 = Node(2)
        val node4 = Node(4)
        val node1 = Node(1)
        node3.children = listOf(node5, node6)
        node1.children = listOf(node3, node2, node4)
        assertEquals(listOf(1,3,5,6,2,4), Solution().preorder(node1))
    }

    @Test
    fun testEmptyList(){
        assertEquals(emptyList<Int>(), Solution().preorder(null))
    }
}