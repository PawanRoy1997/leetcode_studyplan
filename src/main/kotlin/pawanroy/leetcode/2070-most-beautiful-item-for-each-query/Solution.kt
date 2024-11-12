package pawanroy.leetcode.`2070-most-beautiful-item-for-each-query`

import java.util.SortedMap

class Solution {
    fun maximumBeauty(items: Array<IntArray>, queries: IntArray): IntArray {
        val bestBeauty: SortedMap<Int, Int> = sortedMapOf()
        val ans = IntArray(queries.size) { 0 }
        var prev = 0
        queries.forEach { bestBeauty[it] = 0 }
        items.forEach { item -> bestBeauty[item[0]] = maxOf(bestBeauty[item[0]] ?: 0, item[1]) }
        bestBeauty.forEach { (key, value) -> prev= maxOf(prev, value); bestBeauty[key] = prev }

        queries.forEachIndexed { index, it ->
            ans[index] = bestBeauty[it] ?: 0
        }

        return ans
    }
}