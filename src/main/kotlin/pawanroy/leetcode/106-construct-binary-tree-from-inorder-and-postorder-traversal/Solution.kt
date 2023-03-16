package pawanroy.leetcode.`106-construct-binary-tree-from-inorder-and-postorder-traversal`

import pawanroy.leetcode.TreeNode

class Solution {
    fun buildTree(inorder: IntArray, postorder: IntArray): TreeNode? {
        val last = postorder.lastIndex
        return buildTree(inorder, 0, last, postorder, 0, last)
    }

    private fun buildTree(
        inorder: IntArray,
        inStart: Int,
        inEnd: Int,
        postorder: IntArray,
        postStart: Int,
        postEnd: Int
    ): TreeNode? {
        if (inStart > inEnd || postStart > postEnd) return null
        val root = postorder[postEnd].toTreeNode()
        val rootIndex = inorder.indexOf(root.`val`)

        val leftSize = rootIndex - inStart
        val rightSize = inEnd - rootIndex

        root.left = buildTree(
            inorder = inorder,
            inStart = inStart,
            inEnd = rootIndex - 1,
            postorder = postorder,
            postStart = postStart,
            postEnd = postStart + leftSize - 1
        )

        root.right = buildTree(
            inorder = inorder,
            inStart = rootIndex + 1,
            inEnd = inEnd,
            postorder = postorder,
            postStart = postEnd - rightSize,
            postEnd = postEnd - 1
        )

        return root
    }

    private fun Int.toTreeNode() = TreeNode(this)
}