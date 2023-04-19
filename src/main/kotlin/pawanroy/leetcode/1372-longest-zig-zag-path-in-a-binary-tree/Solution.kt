package pawanroy.leetcode.`1372-longest-zig-zag-path-in-a-binary-tree`

import pawanroy.leetcode.TreeNode

class Solution {

    @Suppress("kotlin:S3776")
    fun longestZigZag(root: TreeNode?): Int {
        if (root == null || (root.left == null && root.right == null)) return 0
        var max = 0
        fun checkZigZag(root: TreeNode, left: Boolean, last: Int) {
            if (left) {
                if (root.left == null) max = maxOf(last + 1, max)
                else checkZigZag(root.left!!, false, last + 1)
                if (root.right != null) checkZigZag(root.right!!, true, 0)
            } else {
                if (root.right == null) max = maxOf(last + 1, max)
                else checkZigZag(root.right!!, true, last + 1)
                if (root.left != null) checkZigZag(root.left!!, false, 0)
            }

        }

        if (root.left != null) checkZigZag(root.left!!, false, 0)
        if (root.right != null) checkZigZag(root.right!!, true, 0)

        return max
    }
}