package pawanroy.leetcode.`1266-minimum-time-visiting-all-points`

class Solution {
    fun minTimeToVisitAllPoints(points: Array<IntArray>): Int {
        var prevPoint = points.first()
        var time = 0
        for (point in points) {
            val x = maxOf(prevPoint.first() - point.first(), point.first() - prevPoint.first())
            val y = maxOf(prevPoint[1] - point[1], point[1] - prevPoint[1])
            time += maxOf(x, y)
            prevPoint = point
        }
        return time
    }
}