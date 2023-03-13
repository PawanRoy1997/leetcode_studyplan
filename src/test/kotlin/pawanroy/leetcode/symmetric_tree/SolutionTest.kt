package pawanroy.leetcode.symmetric_tree

import org.junit.jupiter.api.Test
import pawanroy.leetcode.TreeNode
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class SolutionTest{
    private val sol = Solution()

    @Test
    fun caseRootOnly(){
        val root = TreeNode(1)
        assertTrue { sol.isSymmetric(root) }
    }

    @Test
    fun caseRootWithOnlyChild(){
        val root = TreeNode(1)
        root.left = TreeNode(2)
        assertFalse { sol.isSymmetric(root) }
    }

    @Test
    fun caseRootWithNonSymmetricChild(){
        val root = TreeNode(1)
        root.left = TreeNode(2)
        root.right = TreeNode(3)
        assertFalse { sol.isSymmetric(root) }
    }

    @Test
    fun caseRootWithSymmetricChild(){
        val root = TreeNode(1)
        root.left = TreeNode(2)
        root.right = TreeNode(2)
        assertTrue { sol.isSymmetric(root) }
    }

    @Test
    fun caseRootWithSymmetricGrandChild(){
        val root = TreeNode(1)
        root.left = TreeNode(2).apply {
            left = TreeNode(3)
            right = TreeNode(4)
        }
        root.right = TreeNode(2).apply {
            left = TreeNode(4)
            right = TreeNode(3)
        }
        assertTrue { sol.isSymmetric(root) }
    }

    @Test
    fun caseRootWithNonSymmetricGrandChild(){
        val root = TreeNode(1)
        root.left = TreeNode(2).apply {
            right = TreeNode(3)
            left = TreeNode(4)
        }
        root.right = TreeNode(2).apply {
            left = TreeNode(4)
            right = TreeNode(3)
        }
        assertFalse { sol.isSymmetric(root) }
    }
}