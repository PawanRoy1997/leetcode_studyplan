package pawanroy.leetcode.`226-invert-binary-tree`

import pawanroy.leetcode.TreeNode

class Solution {
    private var n: TreeNode? = TreeNode(0)
    fun invertTree(root: TreeNode?): TreeNode? {
        return root?.apply {
            n = left
            left = right
            right = n
            invertTree(left)
            invertTree(right)
        }
    }
}