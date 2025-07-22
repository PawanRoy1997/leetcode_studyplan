package pawanroy.leetcode.`662-maximum-width-of-binary-tree`

import pawanroy.leetcode.TreeNode
import java.util.*

class Solution {
    class Node(var node: TreeNode, var idx: Int)

    fun widthOfBinaryTree(root: TreeNode?): Int {
        if (root == null) return 0
        val queue: Queue<Node> = LinkedList()
        queue.add(Node(root, 0))
        var max = 0
        while (!queue.isEmpty()) {
            val size = queue.size
            var start = 0
            var end = 0
            for (i in 0 until size) {
                val eachNode = queue.remove()
                val index = eachNode.idx
                if (i == 0) start = index //start and end index for each level
                if (i == size - 1) end = index
                if (eachNode.node.left != null) queue.add(Node(eachNode.node.left!!, 2 * eachNode.idx))
                if (eachNode.node.right != null) queue.add(Node(eachNode.node.right!!, 2 * eachNode.idx + 1))
            }
            max = maxOf(max, end - start + 1)
        }
        return max
    }
}