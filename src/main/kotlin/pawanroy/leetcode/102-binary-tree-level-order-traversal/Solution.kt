package pawanroy.leetcode.`102-binary-tree-level-order-traversal`

import pawanroy.leetcode.TreeNode

class Solution {
    private val result = ArrayList<ArrayList<Int>>()
    fun levelOrder(root: TreeNode?): List<List<Int>> {
        putValues(root, 0)
        return result
    }

    private fun putValues(root: TreeNode?, generation: Int) {
        if (root == null) return
        if (generation == result.size) result.add(arrayListOf())
        result[generation].add(root.`val`)
        putValues(root.left, generation + 1)
        putValues(root.right, generation + 1)
    }
}