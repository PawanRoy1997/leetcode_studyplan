package pawanroy.leetcode.`2406-divide-intervals-into-minimum-number-of-groups`

class Solution {
    fun minGroups(intervals: Array<IntArray>): Int {
        val startTimes = IntArray(intervals.size)
        val endTimes = IntArray(intervals.size)

        intervals.forEachIndexed {index, v ->
            startTimes[index] = v.first()
            endTimes[index] = v.last()
        }

        startTimes.sort()
        endTimes.sort()

        var end = 0
        var group = 0

        startTimes.forEach {
            if(it > endTimes[end]){
                end++
            }else{
                group++
            }
        }

        return group
    }
}