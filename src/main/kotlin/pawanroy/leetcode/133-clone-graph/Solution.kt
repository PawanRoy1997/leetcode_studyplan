package pawanroy.leetcode.`133-clone-graph`


class Node(var `val`: Int) {
    var neighbors: ArrayList<Node?> = ArrayList()
}

class Solution {

    private val nodes = Array(101) { Node(it) }
    private val seen = HashSet<Int>()

    fun cloneGraph(node: Node?): Node? {
        if (node == null) return null
        fun setNeighbors(node: Node) {
            if (seen.contains(node.`val`)) return
            seen.add(node.`val`)
            for (n in node.neighbors) {
                if (n != null) {
                    nodes[node.`val`].neighbors.add(nodes[n.`val`])
                    cloneGraph(n)
                }
            }
        }
        setNeighbors(node)
        return nodes[1]
    }
}