package pawanroy.leetcode.`104-maximum-dept-of-binary-tree`

import pawanroy.leetcode.TreeNode

class Solution {
    fun maxDepth(root: TreeNode?): Int {
        var result = 0
        fun checkDepth(node: TreeNode, depth: Int) {
            if (node.left == node.right) result = maxOf(result, depth + 1)
            if (node.left != null) checkDepth(node.left!!, depth + 1)
            if (node.right != null) checkDepth(node.right!!, depth + 1)
        }
        if (root == null) return 0
        checkDepth(root, 0)
        return result
    }
}