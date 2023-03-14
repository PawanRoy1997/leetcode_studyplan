package pawanroy.leetcode.`1345-jump-game-iv`

import java.util.*

@Suppress("kotlin:S3776")
class Solution {
    fun minJumps(arr: IntArray): Int {
        val n = arr.size
        // {a: indices}
        val graph: MutableMap<Int, MutableList<Int>> = HashMap()
        // Initialize a map to store the indices of each value in the array
        val q: Queue<Int> = ArrayDeque(mutableListOf(0))
        // Initialize a queue with the first index and mark it as seen
        val seen = BooleanArray(n)

        seen[0] = true

        // Add the current index to the list of indices for its corresponding value
        arr.forEachIndexed { i, num ->
            graph.putIfAbsent(num, ArrayList())
            graph[num]!!.add(i)
        }

        var steps = 0
        while (!q.isEmpty()) {

            // Iterate over all the nodes at the current level of the BFS
            for (sz in q.size downTo 1) {
                // Dequeue the next node and check if it's the last index of the array
                val i = q.poll()

                // If we reach the last index then we have to stop the operation
                if (i == arr.lastIndex) return steps
                seen[i] = true

                val u = arr[i]
                // Add the adjacent nodes to the list of indices for their corresponding value
                if (i + 1 < n) graph[u]!!.add(i + 1)
                if (i - 1 >= 0) graph[u]!!.add(i - 1)
                // Iterate over all the adjacent nodes and enqueue them if they haven't been seen yet
                for (v in graph[u]!!) {
                    if (seen[v]) continue
                    q.offer(v)
                }
                // Clear the list of indices for the current node value to avoid revisiting it
                graph[u]!!.clear()
            }
            ++steps
        }
        throw IllegalArgumentException()
    }
}