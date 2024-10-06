package pawanroy.leetcode.`1331-rank-transform-of-an-array`

class Solution {
    fun arrayRankTransform(arr: IntArray): IntArray {
        val ranks = HashMap<Int, Int>()
        val sortedList = arr.distinct().sorted()
        sortedList.forEachIndexed { index, i -> ranks[i] = index+1 }

        return arr.map { ranks[it] as Int }.toIntArray()
    }
}