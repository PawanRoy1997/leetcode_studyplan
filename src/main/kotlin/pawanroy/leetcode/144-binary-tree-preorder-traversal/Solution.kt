package pawanroy.leetcode.`144-binary-tree-preorder-traversal`

import pawanroy.leetcode.TreeNode

class Solution {
    fun preorderTraversal(root: TreeNode?): List<Int> {
        val res = ArrayList<Int>()

        fun traverse(node: TreeNode) {
            res.add(node.`val`)
            if (node.left != null) traverse(node.left!!)
            if (node.right != null) traverse(node.right!!)
        }

        if (root != null) traverse(root)

        return res
    }
}