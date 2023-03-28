package pawanroy.leetcode.`145-binary-tree-postorder-traversal`

import pawanroy.leetcode.TreeNode

class Solution {
    fun postorderTraversal(root: TreeNode?): List<Int> {
        val res = ArrayList<Int>()

        fun traverse(node: TreeNode) {
            if (node.left != null) traverse(node.left!!)
            if (node.right != null) traverse(node.right!!)
            res.add(node.`val`)
        }

        if (root != null) traverse(root)

        return res
    }
}