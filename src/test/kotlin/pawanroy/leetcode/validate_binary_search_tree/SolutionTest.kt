package pawanroy.leetcode.validate_binary_search_tree

import org.junit.jupiter.api.Test
import pawanroy.leetcode.TreeNode
import kotlin.test.assertTrue
import kotlin.test.assertFalse

class SolutionTest{
    @Test
    fun testEmptyRoot(){
//        if root is empty then solution is true
        assertTrue (Solution().isValidBST(null))
    }
    @Test
    fun testHasNoChild(){
//        if root has no left and right then solution is still true
        assertTrue (Solution().isValidBST(TreeNode(1)))
    }

    @Test
    fun testLeftChildCheck(){
//        if root has no left and right then solution is still true
        val root = TreeNode(2)
        root.left = TreeNode(1)
        assertTrue (Solution().isValidBST(root))
        root.left = TreeNode(2)
        assertFalse (Solution().isValidBST(root))
    }

    @Test
    fun testRightChildCheck(){
//        if root has no left and right then solution is still true
        val root = TreeNode(2)
        root.right = TreeNode(3)
        assertTrue (Solution().isValidBST(root))
        root.right = TreeNode(2)
        assertFalse (Solution().isValidBST(root))
    }

    @Test
    fun testAllChildOfRightShouldBeGreaterThanRoot(){
//        if root has no left and right then solution is still true
        val root = TreeNode(2)
        root.right = TreeNode(3)
        assertTrue (Solution().isValidBST(root))
        root.right = TreeNode(2)
        assertFalse (Solution().isValidBST(root))
    }
}