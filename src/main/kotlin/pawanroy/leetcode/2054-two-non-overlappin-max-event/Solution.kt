package pawanroy.leetcode.`2054-two-non-overlappin-max-event`

class Solution {
    fun maxTwoEvents(events: Array<IntArray>): Int {
        val n = events.size


        // Step 1: Sort the events by their start time
        events.sortBy { it[0] }


        // Step 2: Create the suffix array for the maximum event value from each event onward
        val suffixMax = IntArray(n)
        suffixMax[n - 1] = events[n - 1][2] // Initialize the last event's value


        // Populate the suffixMax array
        for (i in n - 2 downTo 0) {
            suffixMax[i] = maxOf(events[i][2], suffixMax[i + 1])
        }


        // Step 3: For each event, find the next event that starts after it ends
        var maxSum = 0

        for (i in 0 until n) {
            var left = i + 1
            var right = n - 1
            var nextEventIndex = -1


            // Perform binary search to find the next non-overlapping event
            while (left <= right) {
                val mid = left + (right - left) / 2
                if (events[mid][0] > events[i][1]) {
                    nextEventIndex = mid
                    right = mid - 1
                } else {
                    left = mid + 1
                }
            }


            // If a valid next event is found, update the max sum
            if (nextEventIndex != -1) {
                maxSum = maxOf(maxSum, (events[i][2] + suffixMax[nextEventIndex]))
            }


            // Also consider the case where we take only the current event
            maxSum = maxOf(maxSum, events[i][2])
        }

        return maxSum
    }
}