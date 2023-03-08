package pawanroy.leetcode.koko_eating_bananas

@Suppress("kotlin:S3776")
class Solution {
    fun minEatingSpeed(piles: IntArray, h: Int): Int {
        var lower = 0L
        var upper = 0L

        fun getHours(piles: IntArray, speed: Long): Int {
            var hours = 0
            for (item in piles) {
                hours += (item.toLong() / speed).toInt()
                if (item.toLong() % speed != 0L) hours++
            }
            return hours
        }

        for (item in piles) {
            upper += item
        }
        var mid: Long
        var hours: Int

        if (upper < h) {
            return 1
        }
        while (true) {
            mid = lower + (upper - lower) / 2
            if (lower == upper) return lower.toInt()
            if (upper - lower == 1L) {
                hours = getHours(piles, lower)
                return if (hours == h) lower.toInt() else upper.toInt()
            }

            hours = getHours(piles, mid)

            if (hours > h) lower = mid
            if (hours <= h) upper = mid
        }
    }
}