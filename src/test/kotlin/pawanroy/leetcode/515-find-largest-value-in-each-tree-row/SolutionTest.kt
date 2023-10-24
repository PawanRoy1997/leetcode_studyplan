package pawanroy.leetcode.`515-find-largest-value-in-each-tree-row`

import pawanroy.leetcode.TreeNode
import kotlin.test.Test
import kotlin.test.assertEquals

class SolutionTest {
    private val sol = Solution()

    @Test
    fun caseOne() {
        val root = TreeNode(1).apply {
            this.left  = TreeNode(3).apply {
                left = TreeNode(5)
                right = TreeNode(3)
            }

            this.right = TreeNode(2).apply {
                right = TreeNode(9)
            }
        }

        val expected = listOf(1, 3, 9)

        assertEquals(expected, sol.largestValues(root))
    }

    fun <T> assertEquals(expected: List<T>, actual: List<T>) {
        assertEquals(expected.size, actual.size)
        expected.forEachIndexed { index, value ->
            assertEquals(value, actual[index])
        }
    }
}