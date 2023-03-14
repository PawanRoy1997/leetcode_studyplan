package pawanroy.leetcode.`2187-minimum-time-to-complete-trips`

@Suppress("kotlin:S3776")
class Solution {
    fun minimumTime(time: IntArray, totalTrips: Int): Long {

        var maxTime = 0
        var tripsInMaxTime = 0
        var minTime = time[0]

        for (t in time) {
            if (maxTime < t) maxTime = t
            if (minTime > t) minTime = t
        }

        for (t in time) {
            tripsInMaxTime += maxTime / t
        }

        var upperBound = totalTrips.toLong() * maxTime
        var lowerBound: Long = minTime.toLong()
        var trips: Long
        var mid: Long
        while (true) {
            trips = 0L
            if (upperBound == lowerBound) return lowerBound
            if (upperBound - lowerBound == 1L) {
                for (t in time) {
                    trips += lowerBound / t
                }
                return if (trips.toInt() >= totalTrips) {
                    lowerBound
                } else upperBound
            }

            mid = lowerBound + (upperBound - lowerBound) / 2
            for (t in time) {
                trips += mid / t
            }

            if (trips >= totalTrips.toLong()) upperBound = mid
            if (trips < totalTrips.toLong()) lowerBound = mid
        }
    }
}