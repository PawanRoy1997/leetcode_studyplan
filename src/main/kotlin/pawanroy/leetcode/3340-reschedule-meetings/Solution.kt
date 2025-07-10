package pawanroy.leetcode.`3340-reschedule-meetings`

class Solution {
    fun maxFreeTime(eventTime: Int, startTime: IntArray, endTime: IntArray): Int {
        val freeTimes = IntArray(startTime.size + 1)
        val maxRightFreeTime = IntArray(startTime.size + 1)
        var maxLeft = 0
        var res = 0

        for (i in startTime.indices) {
            if (i == 0) freeTimes[i] = startTime[i]
            else freeTimes[i] = startTime[i] - endTime[i - 1]
        }
        freeTimes[startTime.size] = eventTime - endTime[startTime.lastIndex]

        for (i in startTime.lastIndex downTo 0) {
            maxRightFreeTime[i] = maxOf(maxRightFreeTime[i + 1], freeTimes[i + 1])
        }

        for (i in startTime.indices) {
            val dur = endTime[i] - startTime[i]

            if (maxLeft >= dur || maxRightFreeTime[i+1] >= dur) {
                res = maxOf(res, freeTimes[i] + dur + freeTimes[i + 1])
            }

            res = maxOf(res, freeTimes[i]+ freeTimes[i+1])
            maxLeft = maxOf(maxLeft, freeTimes[i])
        }

        return res
    }
}