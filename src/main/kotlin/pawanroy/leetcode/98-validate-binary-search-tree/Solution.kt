package pawanroy.leetcode.`98-validate-binary-search-tree`

import pawanroy.leetcode.TreeNode

class Solution {
    fun isValidBST(root: TreeNode?): Boolean {
        return getList(root).asSequence()
            .zipWithNext { previous, current -> previous < current }
            .all { it }
    }

    private fun getList(root: TreeNode?): ArrayList<Int> {
        if (root == null) return arrayListOf()
        val left = getList(root.left)
        val right = getList(root.right)
        return left.apply {
            add(root.`val`)
            addAll(right)
        }
    }


}