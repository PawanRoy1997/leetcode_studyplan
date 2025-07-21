package pawanroy.leetcode.`3243-shortest-road`

class Solution {
    fun shortestDistanceAfterQueries(n: Int, queries: Array<IntArray>): IntArray {
        val distances = IntArray(n){n -1 -it}

        val graph: Array<ArrayList<Int>> = Array(n){ArrayList()}
        for(i in 1..distances.lastIndex){
            graph[i].add(i-1)
        }

        val answers = IntArray(queries.size)

        for((queryIndex, q) in queries.withIndex()){
            graph[q[1]].add(q[0])
            distances[q[0]] = minOf(distances[q[0]], distances[q[1]]+1)

            updateDistances(graph, q[0], distances)

            answers[queryIndex] = distances[0]
        }

        return answers
    }

    private fun updateDistances(graph: Array<ArrayList<Int>>, current: Int, distances: IntArray){
        val newDist = distances[current]+1

        for(n in graph[current]){
            if(distances[n] <= newDist) continue
            distances[n] = newDist
            updateDistances(graph, n, distances)
        }
    }
}