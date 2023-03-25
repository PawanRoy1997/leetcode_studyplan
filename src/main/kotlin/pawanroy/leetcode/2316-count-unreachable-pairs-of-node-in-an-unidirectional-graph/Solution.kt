package pawanroy.leetcode.`2316-count-unreachable-pairs-of-node-in-an-unidirectional-graph`

@Suppress("kotlin:S3776")
class Solution {
    fun countPairs(n: Int, edges: Array<IntArray>): Long {
        if (n < 2) return 0
        val pointerArray = IntArray(n) { it }
        var a = true

        while (a) {
            a = false
            for (connection in edges) {
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

        pointerArray.sort()

        val arr = ArrayList<Int>()
        var lastMatch = 0
        for (i in pointerArray.indices) {
            if (pointerArray[lastMatch] == pointerArray[i]) continue
            arr.add(i - lastMatch)
            lastMatch = i
        }
        arr.add(n - lastMatch)

        var result = 0L
        var sum = 0L
        for (item in arr) {
            result += sum * item
            sum += item
        }

        return result
    }
}