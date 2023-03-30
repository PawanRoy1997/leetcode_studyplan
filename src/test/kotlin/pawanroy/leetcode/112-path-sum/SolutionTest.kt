package pawanroy.leetcode.`112-path-sum`

import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test
import pawanroy.leetcode.TreeNode

class SolutionTest {
    private val sol = Solution()

    @Test
    fun caseOne() {
        val root = TreeNode(5).apply {
            left = TreeNode(4).apply {
                left = TreeNode(11).apply {
                    left = TreeNode(7)
                    right = TreeNode(2)
                }
            }
            right = TreeNode(8).apply {
                left = TreeNode(13)
                right = TreeNode(4).apply {
                    right = TreeNode(1)
                }
            }
        }
        assertTrue(sol.hasPathSum(root, 22))
    }
}