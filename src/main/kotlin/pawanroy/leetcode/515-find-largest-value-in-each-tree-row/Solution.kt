package pawanroy.leetcode.`515-find-largest-value-in-each-tree-row`

import pawanroy.leetcode.TreeNode

class Solution {
    fun largestValues(root: TreeNode?): List<Int> {
        val result = ArrayList<Int>()

        fun largestOfRow(node: TreeNode?, row: Int) {
            if (node == null) return
            if (row == result.size) result.add(node.`val`)
            else result[row] = maxOf(node.`val`, result[row])

            largestOfRow(node.left, row+1)
            largestOfRow(node.right, row+1)
        }

        largestOfRow(root, 0)

        return result
    }
}