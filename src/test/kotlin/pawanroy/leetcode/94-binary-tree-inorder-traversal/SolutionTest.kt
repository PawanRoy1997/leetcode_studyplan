package pawanroy.leetcode.`94-binary-tree-inorder-traversal`

import org.junit.jupiter.api.Test
import pawanroy.leetcode.TreeNode
import kotlin.test.assertEquals

class SolutionTest {
    private val sol = Solution()

    @Test
    fun caseOne() {
        val root = TreeNode(1).apply {
            right = TreeNode(2).apply {
                left = TreeNode(3)
            }
        }
        assertEquals(listOf(1, 3, 2), sol.inorderTraversal(root))
    }

    @Test
    fun caseTwo() {
        assertEquals(listOf(), sol.inorderTraversal(null))
    }
}