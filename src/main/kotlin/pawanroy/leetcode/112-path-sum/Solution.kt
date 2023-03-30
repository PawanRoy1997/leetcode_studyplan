package pawanroy.leetcode.`112-path-sum`

import pawanroy.leetcode.TreeNode

class Solution {
    fun hasPathSum(root: TreeNode?, targetSum: Int): Boolean {
        val sums = HashSet<Int>()
        fun findSum(node: TreeNode, parentSum: Int) {
            if (node.left == node.right) {
                sums.add(parentSum + node.`val`)
            }
            if (node.left != null) findSum(node.left!!, parentSum + node.`val`)
            if (node.right != null) findSum(node.right!!, parentSum + node.`val`)
        }
        if (root != null) findSum(root, 0)
        return sums.contains(targetSum)
    }
}