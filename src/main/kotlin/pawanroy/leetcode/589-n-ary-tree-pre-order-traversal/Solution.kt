package pawanroy.leetcode.`589-n-ary-tree-pre-order-traversal`

import pawanroy.leetcode.Node

class Solution {

    fun preorder(root: Node?): List<Int> {
        return if (root == null) {
            emptyList()
        } else if (root.children == null) {
            arrayListOf(root.`val`)
        } else {
            val result: ArrayList<Int> = arrayListOf(root.`val`)
            root.children!!.forEach{ result.addAll(preorder(it)) }
            result
        }
    }
}