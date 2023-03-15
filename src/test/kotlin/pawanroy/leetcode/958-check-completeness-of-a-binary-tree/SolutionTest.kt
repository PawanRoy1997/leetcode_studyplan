package pawanroy.leetcode.`958-check-completeness-of-a-binary-tree`

import org.junit.jupiter.api.Test
import pawanroy.leetcode.TreeNode
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class SolutionTest {
    private val sol = Solution()

    @Test
    fun caseOne() {
        assertTrue(sol.isCompleteTree(null))
    }

    @Test
    fun caseTwo() {
        assertTrue(sol.isCompleteTree(TreeNode(1)))
    }

    @Test
    fun caseThree() {
        val root = TreeNode(1).apply {
            left = TreeNode(2)
        }
        assertTrue(sol.isCompleteTree(root))
    }

    @Test
    fun caseFour() {
        val root = TreeNode(1).apply {
            left = TreeNode(2).apply {
                left = TreeNode(3)
            }
        }
        assertFalse(sol.isCompleteTree(root))
    }

    @Test
    fun caseFive() {
        val root = TreeNode(1).apply {
            right = TreeNode(3).apply {
                left = TreeNode(6)
            }

            left = TreeNode(2).apply {
                left = TreeNode(4)
                right = TreeNode(5)
            }
        }
        assertTrue ( sol.isCompleteTree(root) )
    }
}