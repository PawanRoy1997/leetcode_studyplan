package pawanroy.leetcode.`653-two-sum-4-input-is-a-bst`

import pawanroy.leetcode.TreeNode

class Solution {
    fun findTarget(root: TreeNode?, k: Int): Boolean {
        if (root == null) return false
        val s = HashSet<Int>()
        fun addToSet(node: TreeNode) {
            s.add(node.`val`)
            if (node.left != null) addToSet(node.left!!)
            if (node.right != null) addToSet(node.right!!)
        }
        addToSet(root)
        for (i in 0 until s.size - 1) {
            if (i == k / 2) continue
            if (s.contains(k - i)) return true
        }

        return false
    }
}