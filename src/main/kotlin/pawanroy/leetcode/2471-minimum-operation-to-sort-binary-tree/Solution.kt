package pawanroy.leetcode.`2471-minimum-operation-to-sort-binary-tree`

import pawanroy.leetcode.TreeNode
import java.util.*

class Solution {

    fun minimumOperations(root: TreeNode?): Int {
        if (root == null) return 0
        var count = 0
        val q: Queue<TreeNode> = LinkedList()
        q.add(root)
        val arr = ArrayList<Int>()
        val pq: PriorityQueue<Int> = PriorityQueue()
        var c = 0

        while (q.isNotEmpty()) {
            arr.clear()
            pq.clear()
            repeat(q.size) {
                val p = q.poll()
                arr.add(p.`val`)
                pq.add(p.`val`)
                if (p.left != null) q.add(p.left)
                if (p.right != null) q.add(p.right)
            }
            c = 0

            for (i in arr.indices) {
                if (arr[i] != pq.poll()) c++
            }

            count += (c / 2) + (c % 2)
        }

        return count
    }
}