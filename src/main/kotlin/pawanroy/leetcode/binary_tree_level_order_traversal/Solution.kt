package pawanroy.leetcode.binary_tree_level_order_traversal

import pawanroy.leetcode.TreeNode
import kotlin.math.max

class Solution {
    fun levelOrder(root: TreeNode?): List<List<Int>> {
        return if (root == null) emptyList() else ArrayList<List<Int>>().apply {
            add(listOf(root.`val`))
            val left = levelOrder(root.left)
            val right = levelOrder(root.right)
            val levels = max(left.size, right.size)
            repeat(levels) {
                add(
                    arrayListOf<Int>().apply {
                        addAll(left.getValue(it))
                        addAll(right.getValue(it))
                    }
                )
            }
        }
    }

    private fun List<List<Int>>.getValue(index:Int): List<Int>{
        return if(index < this.size) this.get(index) else emptyList()
    }
}