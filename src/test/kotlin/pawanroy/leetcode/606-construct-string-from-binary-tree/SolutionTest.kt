package pawanroy.leetcode.`606-construct-string-from-binary-tree`

import pawanroy.leetcode.TreeNode
import kotlin.test.Test
import kotlin.test.assertEquals

class SolutionTest {
    private val sol = Solution()

    @Test
    fun caseOne(){
        val root = TreeNode(1).apply {
            left = TreeNode(2).apply {
                left = TreeNode(4)
            }

            right = TreeNode(3)
        }
        assertEquals("1(2(4))(3)", sol.tree2str(root))
    }
}