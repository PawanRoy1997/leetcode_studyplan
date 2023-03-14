package pawanroy.leetcode.`101-symmetric-tree`

import pawanroy.leetcode.TreeNode

class Solution {
    fun isSymmetric(root: TreeNode?): Boolean {
        return hasSymmetricChildren(nodeA = root?.left, nodeB = root?.right)
    }

    private fun hasSymmetricChildren(nodeA: TreeNode?, nodeB: TreeNode?): Boolean {
//        When both are null they are equal
//        Else match their values and their children
        if (nodeA == nodeB) return true
        return  (nodeA?.`val` == nodeB?.`val`) && hasSymmetricChildren(nodeA?.left, nodeB?.right)
                && hasSymmetricChildren(nodeA?.right, nodeB?.left)
    }
}