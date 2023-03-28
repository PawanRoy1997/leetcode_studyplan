package pawanroy.leetcode.`94-binary-tree-inorder-traversal`

import pawanroy.leetcode.TreeNode

class Solution {
    fun inorderTraversal(root: TreeNode?): List<Int> {
        val res = ArrayList<Int>()

        fun traverse(node: TreeNode) {
            if (node.left != null) traverse(node.left!!)
            res.add(node.`val`)
            if (node.right != null) traverse(node.right!!)
        }

        if (root != null) traverse(root)

        return res
    }
}