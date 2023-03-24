package pawanroy.leetcode.`1466-reorder-routes-to-make-all-path-leads-to-the-city-zero`

class Solution {
    fun minReorder(n: Int, connections: Array<IntArray>): Int {
        val pointers = IntArray(n) { it }
        var completed = false
        var result = 0
        while (!completed) {
            completed = true
            for (connection in connections) {
                if (pointers[connection[0]] == 0 && pointers[connection[1]] != 0) {
                    pointers[connection[1]] = 0
                    result += 1
                    completed = false
                } else if (pointers[connection[1]] == 0 && pointers[connection[0]] != 0) {
                    pointers[connection[0]] = 0
                    completed = false
                }
            }
        }

        return result
    }
}