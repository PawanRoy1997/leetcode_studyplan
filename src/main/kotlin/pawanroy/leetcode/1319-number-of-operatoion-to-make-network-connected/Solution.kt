package pawanroy.leetcode.`1319-number-of-operatoion-to-make-network-connected`

class Solution {
    fun makeConnected(n: Int, connections: Array<IntArray>): Int {
        if (connections.size < n - 1) return -1
        val pointerArray = IntArray(n) { it }

        var a = true

        while (a) {
            a = false
            for (connection in connections) {
                if (pointerArray[connection[0]] < pointerArray[connection[1]]) {
                    pointerArray[connection[1]] = pointerArray[connection[0]]
                    a = true
                }
                if (pointerArray[connection[0]] > pointerArray[connection[1]]) {
                    pointerArray[connection[0]] = pointerArray[connection[1]]
                    a = true
                }
            }
            for (i in pointerArray.indices) {
                pointerArray[i] = pointerArray[pointerArray[i]]
            }
        }

        var result = -1
        for (p in pointerArray.indices) if (pointerArray[p] == p) result += 1

        return result
    }
}