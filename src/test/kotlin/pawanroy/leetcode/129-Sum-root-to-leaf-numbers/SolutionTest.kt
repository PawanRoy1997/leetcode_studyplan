package pawanroy.leetcode.`129-Sum-root-to-leaf-numbers`

import org.junit.jupiter.api.Test
import pawanroy.leetcode.TreeNode
import kotlin.test.assertEquals

class SolutionTest {
    private val sol =  Solution()

    @Test
    fun caseOne(){
        val root = TreeNode(1).apply {
            left = TreeNode(2)
            right = TreeNode(3)
        }

        assertEquals(25, sol.sumNumbers(root))
    }

    @Test
    fun caseTwo(){
        val root = TreeNode(4).apply {
            left = TreeNode(9).apply {
                left = TreeNode(5)
                right = TreeNode(1)
            }
            right = TreeNode(0)
        }

        assertEquals(1026, sol.sumNumbers(root))
    }
}