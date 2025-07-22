package pawanroy.leetcode.`107-binary-tree-level-order-traversal-ii`

import org.junit.jupiter.api.Test
import pawanroy.leetcode.TreeNode
import kotlin.test.assertEquals

class SolutionTest {
    private val sol = Solution()

    @Test
    fun caseOne() {
        val root = TreeNode(3).apply {
            left = TreeNode(9)
            right = TreeNode(20).apply {
                left = TreeNode(15)
                right = TreeNode(7)
            }
        }

        val res = sol.levelOrderBottom(root)
        val expected:Array<Array<Int>> = arrayOf(arrayOf(15,7), arrayOf(9,20), arrayOf(3))
        res.forEachIndexed { index, ints ->
            ints.forEachIndexed { index2, int->
                assertEquals(expected[index][index2], int)
            }
        }

    }
}