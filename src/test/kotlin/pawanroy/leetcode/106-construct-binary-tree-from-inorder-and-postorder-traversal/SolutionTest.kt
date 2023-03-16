package pawanroy.leetcode.`106-construct-binary-tree-from-inorder-and-postorder-traversal`

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test
import pawanroy.leetcode.TreeNode

class SolutionTest {
    private val sol = Solution()

    @Test
    fun caseZero() {
        val inOrder = intArrayOf(-1)
        val postOrder = intArrayOf(-1)

        val res = sol.buildTree(inOrder, postOrder)

        assertArrayEquals(inOrder, inOrder(res).toIntArray())
        assertArrayEquals(postOrder, postOrder(res).toIntArray())
    }

    @Test
    fun caseEmpty() {
        val inOrder = intArrayOf()
        val postOrder = intArrayOf()

        val res = sol.buildTree(inOrder, postOrder)

        assertArrayEquals(inOrder, inOrder(res).toIntArray())
        assertArrayEquals(postOrder, postOrder(res).toIntArray())
    }

    @Test
    fun caseLeft() {
        val inOrder = intArrayOf(1, 2)
        val postOrder = intArrayOf(1, 2)

        val res = sol.buildTree(inOrder, postOrder)

        assertArrayEquals(inOrder, inOrder(res).toIntArray())
        assertArrayEquals(postOrder, postOrder(res).toIntArray())
    }

    @Test
    fun caseRight() {
        val inOrder = intArrayOf(2, 1)
        val postOrder = intArrayOf(1, 2)

        val res = sol.buildTree(inOrder, postOrder)

        val resInOrder = inOrder(res).toIntArray()
        val resPostOrder = postOrder(res).toIntArray()

        assertArrayEquals(inOrder, resInOrder)
        assertArrayEquals(postOrder, resPostOrder)
    }

    private fun inOrder(root: TreeNode?): ArrayList<Int> {
        if (root == null) return ArrayList()
        val res = ArrayList<Int>()
        if (root.left != null) res.addAll(inOrder(root.left))
        res.add(root.`val`)
        if (root.right != null) res.addAll(inOrder(root.right))
        return res
    }

    private fun postOrder(root: TreeNode?): ArrayList<Int> {
        if (root == null) return ArrayList()
        val res = ArrayList<Int>()
        if (root.left != null) res.addAll(inOrder(root.left))
        if (root.right != null) res.addAll(inOrder(root.right))
        res.add(root.`val`)
        return res
    }
}