package pawanroy.leetcode.`1637-widest-vertical-area-between-two-points`

class Solution {
    fun maxWidthOfVerticalArea(points: Array<IntArray>): Int {
        val list = ArrayList<Int>()
        points.forEach { list.add(it.first()) }
        list.sort()
        var max = 0
        var prev = list.first()
        list.forEach {
            max = maxOf(max, it - prev)
            prev = it
        }
        return max
    }
}