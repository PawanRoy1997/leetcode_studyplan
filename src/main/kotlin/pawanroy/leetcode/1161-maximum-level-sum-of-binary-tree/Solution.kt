package pawanroy.leetcode.`1161-maximum-level-sum-of-binary-tree`

import pawanroy.leetcode.TreeNode

class Solution {
    fun maxLevelSum(root: TreeNode?): Int {
        if (root == null) return 0

        val sums = ArrayList<Int>()

        fun levelSum(level: Int, node: TreeNode) {
            if (sums.size == level) sums.add(node.`val`)
            else sums[level] += node.`val`

            if (node.left != null) levelSum(level + 1, node.left!!)
            if (node.right != null) levelSum(level + 1, node.right!!)
        }

        var max = sums[0]
        var level = 0

        sums.forEachIndexed { index, value ->
            if (max < value) {
                max = value
                level = index
            }
        }

        return level + 1
    }
}