package pawanroy.leetcode.`653-two-sum-4-input-is-a-bst`

import org.junit.jupiter.api.Test
import pawanroy.leetcode.TreeNode
import kotlin.test.assertTrue

class SolutionTest {
    private val sol = Solution()

    @Test
    fun caseOne() {
        val root = TreeNode(2).apply {
            left = TreeNode(1)
            right = TreeNode(3)
        }
        assertTrue(sol.findTarget(root, 3))
    }

    @Test
    fun caseTwo() {
        val root = TreeNode(2).apply {
            left = TreeNode(1)
            right = TreeNode(3)
        }
        assertTrue(sol.findTarget(root, 4))
    }
}