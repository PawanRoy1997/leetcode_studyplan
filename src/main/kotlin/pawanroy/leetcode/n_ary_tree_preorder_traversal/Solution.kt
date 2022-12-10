package pawanroy.leetcode.n_ary_tree_preorder_traversal

class Node(var `val`: Int) {
    var children: List<Node>? = null
}

class Solution {

    fun preorder(root: Node?): List<Int> {
        return when {
            root == null -> {
                emptyList()
            }

            (root.children.isNullOrEmpty()) -> {
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