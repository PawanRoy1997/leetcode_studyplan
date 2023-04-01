package pawanroy.leetcode.`701-insert-into-bst`

import pawanroy.leetcode.TreeNode

class Solution {
    fun insertIntoBST(root: TreeNode?, `val`: Int): TreeNode {
        if (root == null) return TreeNode(`val`)
        if (root.`val` > `val`) if (root.left == null) root.left = TreeNode(`val`) else insertIntoBST(root.left, `val`)
        if (root.`val` < `val`) if (root.right == null) root.right = TreeNode(`val`) else insertIntoBST(
            root.right,
            `val`
        )
        return root
    }
}