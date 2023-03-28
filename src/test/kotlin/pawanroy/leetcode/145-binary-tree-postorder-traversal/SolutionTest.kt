package pawanroy.leetcode.`145-binary-tree-postorder-traversal`

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
        assertEquals(listOf(3, 2, 1), sol.postorderTraversal(root))
    }

    @Test
    fun caseTwo() {
        assertEquals(listOf(), sol.postorderTraversal(null))
    }
}