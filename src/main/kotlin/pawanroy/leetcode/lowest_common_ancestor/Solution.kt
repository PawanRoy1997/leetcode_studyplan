package pawanroy.leetcode.lowest_common_ancestor

import pawanroy.leetcode.TreeNode

class Solution {
    fun lowestCommonAncestor(root: TreeNode?, p: TreeNode?, q: TreeNode?): TreeNode? {
        if (root == null) return null
        if (p == null) return null
        if (q == null) return null
        if (root.`val` == p.`val` || root.`val` == q.`val`) return root
        val leftSuccessor = lowestCommonAncestor(root.left, p, q)
        val rightSuccessor = lowestCommonAncestor(root.right, p, q)
        return if(leftSuccessor!= null && rightSuccessor!= null) root
        else leftSuccessor ?: rightSuccessor
    }
}