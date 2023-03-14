package pawanroy.leetcode.`102-binary-tree-level-order-traversal`

import org.junit.jupiter.api.Test
import pawanroy.leetcode.TreeNode
import kotlin.test.assertEquals

class SolutionTest {
    @Test
    fun testCaseEmptyHead() {
        assertEquals(emptyList(), Solution().levelOrder(null))
    }

    @Test
    fun testCaseHeadOnly() {
        assertEquals(listOf(listOf(1)), Solution().levelOrder(TreeNode(1)))
    }

    @Test
    fun testCaseHeadWithChildren() {
        val node20 = TreeNode(20)
        node20.left = TreeNode(15)
        node20.right = TreeNode(7)
        val node3 = TreeNode(3)
        node3.left = TreeNode(9)
        node3.right = node20
        assertEquals(listOf(listOf(3), listOf(9,20), listOf(15,7)), Solution().levelOrder(node3))
    }

    @Test
    fun testCaseHeadWithChildren1() {
        val node20 = TreeNode(20)
        val node9 = TreeNode(9)
        node9.left = TreeNode(15).apply {
            left = TreeNode(15)
            right = TreeNode(7)
        }
        node9.right = TreeNode(7)
        val node3 = TreeNode(3)
        node3.left = node9
        node3.right = node20
        assertEquals(listOf(listOf(3), listOf(9,20), listOf(15,7), listOf(15,7)), Solution().levelOrder(node3))
    }

    @Test
    fun testCaseHeadWithOneChildren() {
        val node20 = TreeNode(20)
        val node3 = TreeNode(3)
        node3.left = TreeNode(9)
        node3.right = node20
        assertEquals(listOf(listOf(3), listOf(9,20)), Solution().levelOrder(node3))
    }

    @Test
    fun testCaseHeadWithTwoChildren() {
        val node20 = TreeNode(20)
        node20.left = TreeNode(15)
        node20.right = TreeNode(7)
        val node9 = TreeNode(9)
        node9.left = TreeNode(15)
        node9.right = TreeNode(7)
        val node3 = TreeNode(3)
        node3.left = node9
        node3.right = node20
        assertEquals(listOf(listOf(3), listOf(9,20), listOf(15,7,15,7)), Solution().levelOrder(node3))
    }
}