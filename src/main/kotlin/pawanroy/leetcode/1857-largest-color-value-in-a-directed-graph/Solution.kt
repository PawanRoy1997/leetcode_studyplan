package pawanroy.leetcode.`1857-largest-color-value-in-a-directed-graph`


class Solution {
    class Node(private val color: Char) {
        val next = mutableListOf<Int>()
        val da = IntArray(26) { if (color - 'a' == it) 1 else 0 }
        var doneCalculation: Boolean = false
    }

    fun largestPathValue(colors: String, edges: Array<IntArray>): Int {
        val nodes = Array(colors.length) { Node(colors[it]) }
        for (edge in edges) nodes[edge[0]].next.add(edge[1])

        val visited = BooleanArray(colors.length)
        for (pos in colors.indices) {
            val valid = backtrack(nodes, pos, visited)
            if (!valid) return -1
        }

        // now compare to get the largest value
        var maxi = 0
        for (node in nodes) for (next in node.da) maxi = if (maxi < next) next else maxi

        return maxi
    }

    private fun backtrack(nodes: Array<Node>, pos: Int, visited: BooleanArray): Boolean {
        // We visited a node which already done calculation
        if (nodes[pos].doneCalculation) return true

        // We found a circle
        if (visited[pos]) return false

        visited[pos] = true
        for (n in nodes[pos].next) {
            val valid = backtrack(nodes, n, visited)
            if (!valid) return false
        }

        // When we reach here, means we already found all values for the children of nodes[pos]
        // Now we need to combine all values from all children nodes
        for (i in 0..25) {
            var maxi = 0
            for (n in nodes[pos].next) maxi = if (maxi < nodes[n].da[i]) nodes[n].da[i] else maxi
            nodes[pos].da[i] += maxi
        }

        nodes[pos].doneCalculation = true
        return true
    }
}