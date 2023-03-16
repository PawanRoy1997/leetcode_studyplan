package pawanroy.leetcode.`107-binary-tree-level-order-traversal-ii`

import pawanroy.leetcode.TreeNode
import java.lang.Integer.max

class Solution {
    fun levelOrderBottom(root: TreeNode?): List<List<Int>> {
        val result = ArrayList<ArrayList<Int>>()
        var levels = 0
        fun addToList(root: TreeNode?, gen: Int): Int {
            levels = max(levels, gen)
            if (levels == result.size) result.add(arrayListOf())

            if (root == null) return 0

            addToList(root.left, gen + 1)
            addToList(root.right, gen + 1)

            result[gen].add(root.`val`)
            return gen + 1
        }
        addToList(root, 0)
        result.reverse()
        result.removeFirst()
        return result
    }
}