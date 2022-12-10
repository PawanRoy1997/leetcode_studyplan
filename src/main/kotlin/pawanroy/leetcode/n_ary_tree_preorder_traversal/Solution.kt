package pawanroy.leetcode.n_ary_tree_preorder_traversal

import pawanroy.leetcode.Node

class Solution {

    fun preorder(root: Node?): List<Int> {
        return when {
            root == null -> {
                emptyList()
            }

            (root.children == null) -> {
                arrayListOf(root.`val`)
            }

            else -> {
                val result:ArrayList<Int> = arrayListOf(root.`val`)
                root.children!!.map { preorder(it) }.forEach(result::addAll)
                result
            }
        }
    }
}