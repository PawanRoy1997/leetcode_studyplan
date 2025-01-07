package pawanroy.leetcode.`2471-minimum-operation-to-sort-binary-tree`

import org.junit.jupiter.api.Test
import pawanroy.leetcode.TreeNode
import kotlin.test.assertEquals

class SolutionTest {
    private val sol = Solution()

    @Test
    fun caseOne(){
        val input = TreeNode(1).apply {
            left = TreeNode(4).apply {
                left = TreeNode(7)
                right = TreeNode(6)
            }
            right = TreeNode(3).apply {
                left = TreeNode(8).apply {
                    left = TreeNode(9)
                }
                right = TreeNode(5).apply {
                    left = TreeNode(10)
                }
            }
        }
        assertEquals(3, sol.minimumOperations(input))
    }
}