package pawanroy.leetcode.`1339-max-product-splitted-binary-tree`

import pawanroy.leetcode.TreeNode

class Solution {
    private var total = 0L
    private var best = 0L
    private val MOD = 1_000_000_007L

    private fun sum(node: TreeNode?): Long {
        if (node == null) return 0L
        return node.`val`.toLong() + sum(node.left) + sum(node.right)
    }

    private fun dfs(node: TreeNode?): Long {
        if (node == null) return 0L
        val s = node.`val`.toLong() + dfs(node.left) + dfs(node.right)
        val prod = s * (total - s)
        if (prod > best) best = prod
        return s
    }

    fun maxProduct(root: TreeNode?): Int {
        total = sum(root)
        dfs(root)
        return (best % MOD).toInt()
    }
}