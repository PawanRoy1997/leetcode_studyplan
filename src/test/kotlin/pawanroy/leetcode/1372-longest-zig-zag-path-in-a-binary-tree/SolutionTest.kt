package pawanroy.leetcode.`1372-longest-zig-zag-path-in-a-binary-tree`

import org.junit.jupiter.api.Test
import pawanroy.leetcode.TreeNode
import kotlin.test.assertEquals

class SolutionTest {
    private val sol = Solution()

    @Test
    fun caseZero() {
        assertEquals(0, sol.longestZigZag(null))
        assertEquals(0, sol.longestZigZag(TreeNode(0)))
    }

    @Test
    fun caseOne() {
        val rootLeft = TreeNode(1).apply {
            left = TreeNode(1)
        }
        val rootRight = TreeNode(1).apply {
            right = TreeNode(1)
        }
        val root = TreeNode(1).apply {
            left = TreeNode(1)
            right = TreeNode(1)
        }
        assertEquals(1, sol.longestZigZag(rootLeft))
        assertEquals(1, sol.longestZigZag(rootRight))
        assertEquals(1, sol.longestZigZag(root))
    }

    @Test
    fun caseTwo() {
        val rootLeft = TreeNode(1).apply {
            left = TreeNode(1).apply {
                right = TreeNode(1)
            }
        }
        val rootRight = TreeNode(1).apply {
            right = TreeNode(1).apply {
                left = TreeNode(1)
            }
        }
        val root = TreeNode(1).apply {
            left = TreeNode(1).apply {
                right = TreeNode(1)
            }
            right = TreeNode(1).apply {
                left = TreeNode(1)
            }
        }
        assertEquals(2, sol.longestZigZag(rootLeft))
        assertEquals(2, sol.longestZigZag(rootRight))
        assertEquals(2, sol.longestZigZag(root))
    }
}