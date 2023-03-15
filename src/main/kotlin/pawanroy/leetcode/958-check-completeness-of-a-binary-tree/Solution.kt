package pawanroy.leetcode.`958-check-completeness-of-a-binary-tree`

import pawanroy.leetcode.TreeNode
import java.util.*

class Solution {
    fun isCompleteTree(root: TreeNode?): Boolean {
        if (root == null) return true
        val queue: Queue<TreeNode> = LinkedList()
        queue.offer(root)
        var seenNull = false
        while (queue.isNotEmpty()) {
            val n = queue.poll()

            if (n == null) {
                seenNull = true
                continue
            }

            if (seenNull) return false

            queue.offer(n.left)
            queue.offer(n.right)
        }

        return true
    }
}