package pawanroy.leetcode.`3439-reschedule-meetings`

class Solution {
    fun maxFreeTime(eventTime: Int, k: Int, startTime: IntArray, endTime: IntArray): Int {
//        Create Frequencies of free time
        val freq = IntArray(startTime.size + 1)
        val group = IntArray(startTime.size + k)
        for (i in startTime.indices) {
            freq[i] = if (i == 0) startTime[i]
            else startTime[i] - endTime[i - 1]
        }
        freq[freq.lastIndex] = eventTime - endTime.last()
//        Group k frequencies
        var sum = 0
        for (i in freq.indices) {
            sum += freq[i]
            if (i >= (k)) { group[i - (k)] = sum }
            if (i >= k) sum -= freq[i - k]
        }

//        Find the max
        return group.max()
    }
}