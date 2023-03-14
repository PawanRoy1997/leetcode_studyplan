package pawanroy.leetcode.`129-Sum-root-to-leaf-numbers`

import pawanroy.leetcode.TreeNode

class Solution {
    fun sumNumbers(root: TreeNode?): Int {
        if (root == null) return 0
        if (root.left == root.right) return root.`val`
        if (root.left != null) root.left!!.`val` += root.`val` * 10
        if (root.right != null) root.right!!.`val` += root.`val` * 10
        return sumNumbers(root.left)+sumNumbers(root.right)
    }
}