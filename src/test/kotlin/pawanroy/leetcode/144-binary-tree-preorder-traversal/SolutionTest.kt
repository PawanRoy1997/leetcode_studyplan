package pawanroy.leetcode.`144-binary-tree-preorder-traversal`

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test
import pawanroy.leetcode.TreeNode

class SolutionTest {
    private val sol = Solution()

    @Test
    fun caseOne() {
        val head = TreeNode(1).apply {
            right = TreeNode(2).apply {
                left = TreeNode(3)
            }
        }
        assertArrayEquals(arrayOf(1, 2, 3), sol.preorderTraversal(head).toTypedArray())
    }

    @Test
    fun caseTwo() {
        val head = null
        assertArrayEquals(arrayOf(), sol.preorderTraversal(head).toTypedArray())
    }
}