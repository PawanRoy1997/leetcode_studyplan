package pawanroy.leetcode.`606-construct-string-from-binary-tree`

import pawanroy.leetcode.TreeNode

class Solution {
    fun tree2str(root: TreeNode?): String {
        if (root == null) return ""
        val right = if (root.right == null) "" else "(${tree2str(root.right)})"
        val left = if (root.left == null) {
            if (right.isEmpty()) "" else "()"
        } else "(${tree2str(root.left)})"
        return "${root.`val`}$left$right"
    }
}