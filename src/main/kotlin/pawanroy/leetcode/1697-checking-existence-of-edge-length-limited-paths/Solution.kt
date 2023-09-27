package pawanroy.leetcode.`1697-checking-existence-of-edge-length-limited-paths`

import java.util.*

class Solution {
    fun distanceLimitedPathsExist(
        n: Int, edgeList: Array<IntArray>,
        queries: Array<IntArray>
    ): BooleanArray {
        val eCount = edgeList.size
        val qCount = queries.size
        val eSort = LongArray(eCount)
        for (i in eCount - 1 downTo 0) eSort[i] = edgeList[i][2].toLong() * MOD + i
        Arrays.sort(eSort)
        val qSort = LongArray(qCount)
        for (i in qCount - 1 downTo 0) qSort[i] = queries[i][2].toLong() * MOD + i
        Arrays.sort(qSort)
        val parents = IntArray(n)
        for (i in n - 1 downTo 0) parents[i] = i
        val result = BooleanArray(qCount)
        var eSortIdx = 0
        var e = edgeList[(eSort[0] % MOD).toInt()]
        var eDist = e[2]
        for (qSortIdx in 0 until qCount) {
            val qIdx = (qSort[qSortIdx] % MOD).toInt()
            val q = queries[qIdx]
            val qDist = q[2]
            if (eSortIdx < eCount) {
                while (qDist > eDist) {
                    val rootU = findRoot(parents, e[0])
                    val rootV = findRoot(parents, e[1])
                    if (rootU != rootV) parents[rootV] = rootU
                    eSortIdx++
                    if (eSortIdx >= eCount) break
                    e = edgeList[(eSort[eSortIdx] % MOD).toInt()]
                    eDist = e[2]
                }
            }
            if (findRoot(parents, q[0]) == findRoot(parents, q[1])) result[qIdx] = true
        }
        return result
    }

    private fun findRoot(parents: IntArray, node: Int): Int {
        return if (parents[node] == node) node else findRoot(parents, parents[node]).also { parents[node] = it }
    }

    companion object {
        const val MOD = 1000000L
    }
}