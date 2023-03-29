package pawanroy.leetcode.`104-maximum-dept-of-binary-tree`

import org.junit.jupiter.api.Test
import pawanroy.leetcode.TreeNode
import kotlin.test.assertEquals

class SolutionTest {
    private val sol = Solution()

    @Test
    fun caseOne() {
        val root = TreeNode(1).apply {
            left = TreeNode(9)
            right = TreeNode(20).apply {
                left = TreeNode(15)
                right = TreeNode(7)
            }
        }
        assertEquals(3, sol.maxDepth(root))
    }

    @Test
    fun caseTwo() {
        assertEquals(0, sol.maxDepth(null))
    }

    @Test
    fun caseThree() {
        assertEquals(1, sol.maxDepth(TreeNode(0)))
    }
}