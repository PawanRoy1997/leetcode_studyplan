package pawanroy.leetcode.validate_binary_search_tree

import pawanroy.leetcode.TreeNode

class Solution {
    fun isValidBST(root: TreeNode?): Boolean {
        if (root == null) return true
        val list = getList(root)
        var result = true
        var prev:Int? = null
        list.forEach{
            if(prev == null){
                prev = it
            }else {
                result = result && prev!! < it
                prev = it
            }
        }
        return result
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